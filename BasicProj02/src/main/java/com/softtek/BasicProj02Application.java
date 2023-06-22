package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.softtek.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/softtek/cfgs/ApplicationContext.xml")
public class BasicProj02Application {

	public static void main(String[] args) {
		// get the container
		ApplicationContext ctx=SpringApplication.run(BasicProj02Application.class, args);
		//get the target class
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("banglore", "tallur");
	}

}
