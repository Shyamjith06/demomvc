package com.mindtree.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.demo.entity.Employee;
import com.mindtree.demo.service.EmployeeService;


@Controller
public class HelloController {
	@Autowired
	EmployeeService employeeService;
   @RequestMapping("/")
   public String index() {
      return "index";
   }

	
	
	
//   @PostMapping("/hello")
//   public String sayHello(@RequestParam("name") String name, @RequestParam("salary") String salary , Model model) {
//      model.addAttribute("name", name);
//      model.addAttribute("salary", salary);
//      
//      return "hello";
//   }
   
     
	@PostMapping("/empdetails")
	public String addEmployee(@RequestParam("mid") String mId,@RequestParam("name") String name,@RequestParam("salary") String salary, Employee emp,ModelMap map){    
		emp.setmId(mId);
		emp.setName(name);
		emp.setSalary(Integer.parseInt(salary));
		map.addAttribute("name",emp.getName());
		map.addAttribute("mid",emp.getmId());
		map.addAttribute("salary",emp.getSalary());
		employeeService.addEmployee(emp);
		return "hello";
	
   }
	@GetMapping("getemployee")
	public ModelAndView getEmployeeDetails(@RequestParam int empId)
	{
		ModelAndView model=new ModelAndView("hello");
		Employee employee=employeeService.getEmployee(empId);
		model.addObject("mid",employee.getmId());
		model.addObject("name",employee.getName());
		model.addObject("salary",employee.getSalary());
		return model;
		
	}

}