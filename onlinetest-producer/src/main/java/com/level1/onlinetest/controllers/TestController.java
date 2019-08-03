package com.level1.onlinetest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.level1.onlinetest.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Ashni");
		emp.setDesignation("Softwear Engineer");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

}
