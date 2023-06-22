package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.softtek.sbeans.Customer;

@SpringBootApplication
public class BasicProj07YmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BasicProj07YmlApplication.class, args);
		Customer bean = ctx.getBean("custom", Customer.class);
		System.out.println(bean);
	}

}
