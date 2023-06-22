package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.softtek.sbeans.Company;
import com.softtek.sbeans.Employee;

@SpringBootApplication
public class BasicProj05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		// to get the application container
		ApplicationContext ctx=SpringApplication.run(BasicProj05ConfigurationPropertiesApplication.class, args);
		// to get the class object reference
		Employee emp = ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		// close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
