package com.mindtree.demo.service;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.mindtree.demo.entity.Employee;
import com.mindtree.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepository employeeRepository;

	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
		
	}

	public Employee getEmployee(int empId) {
		Employee employee=new Employee();
		employee=employeeRepository.findById(empId).get();
				
		return employee;
	}

	
	

}
