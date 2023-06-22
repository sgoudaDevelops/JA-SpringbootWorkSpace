package com.softtek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.softtek.model.Employee;

@Repository("oracle")
@Profile({"uat","prod"})
public class OracleEmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_by_dESGS = "select * FROM employee  where desg in (?,?,?) order by desg";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesBYDesgn(String desgn1, String desgn2, String desgn3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("employeeDAOImpl.getEmployeesBYDesgn() :: ds" + ds.getClass());
		List<Employee> list = null;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_by_dESGS);) {
			ps.setString(1, desgn1);
			ps.setString(2, desgn2);
			ps.setString(2, desgn2);
			ps.setString(3, desgn3);
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee emp = new Employee();
				emp.setEname(rs.getString("ename"));
				emp.setEno(rs.getInt("eno"));
				emp.setSal(rs.getDouble("sal"));
				emp.setEaddrs(rs.getString("eaddrs"));
				emp.setDeptno(rs.getInt("deptno"));
				emp.setDesg(rs.getString("desg"));
//					emp.setEno(rs.getInt(1));
//					emp.setEname(rs.getString(2));
//					emp.setEaddrs(rs.getString(3));
//					emp.setDesg(rs.getString(4));
//					emp.setSal(rs.getDouble(5));
//					emp.setDeptno(rs.getInt(6));
					list.add(emp);

				}
				//return list;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
