package com.softtek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.dao.IEmployeeDAO;
import com.softtek.model.Employee;
@Service("service")
public class EmployeeServiceImpl implements IServiceimpl {
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchEmployeesByDesgs(String desgs1, String desgs2, String desgs3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EmployeeServiceImpl.fetchEmployeesByDesgs()");
		List<Employee> list = empDAO.getEmployeesBYDesgn(desgs1, desgs2, desgs3);
		
		return list;
	}

}
