package com.softtek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.softtek.model.Employee;
import com.softtek.service.IServiceimpl;


@Controller("payroll")
public class PayrollOperationController {
	@Autowired
	private IServiceimpl service;
	public List<Employee> showAllEmployeeByDesgn(String desgn1,String desgn2, String desgn3) throws Exception{
		List<Employee> employeesByDesgs = service.fetchEmployeesByDesgs(desgn1, desgn2, desgn3);
      return employeesByDesgs;
	}

}
