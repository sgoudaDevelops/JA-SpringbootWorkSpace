package com.softtek.service;

import java.util.List;

import com.softtek.model.Employee;

public interface IServiceimpl {
	public List<Employee> fetchEmployeesByDesgs(String  desgs1,String desgs2,String desg3) throws Exception;

}
