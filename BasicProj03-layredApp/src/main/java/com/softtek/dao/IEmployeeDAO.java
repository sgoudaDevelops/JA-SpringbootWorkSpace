package com.softtek.dao;

import java.util.List;

import com.softtek.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeesBYDesgn(String desgn1,String desgn2, String desgn3) throws Exception;

}
