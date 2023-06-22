package com.softtek;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.softtek.controller.PayrollOperationController;
import com.softtek.model.Employee;

@SpringBootApplication
public class BasicProj03LayredAppApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(BasicProj03LayredAppApplication.class, args);
//		Employee employee = ctx.getBean("mysql",);
//		employee.
		PayrollOperationController payrollOperationController = ctx.getBean("payroll",
				PayrollOperationController.class);
		List<Employee> allEmployeeByDesgn = payrollOperationController.showAllEmployeeByDesgn("dev", "quality",
				"support");
		allEmployeeByDesgn.forEach(emp -> {
			System.out.println(emp);
		});

	}

}
