package com.mindtree.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mindtree.demo.entity.Employee;



public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
