package com.softtek.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("vehicle")
@Lazy(true)
public class Vehicle {
	@Autowired
	//@Qualifier("petrol")
	@Qualifier("eng")
	private Iengine engine;

	public Vehicle() {
		super();
		System.out.println("Vehicle.0-param constructor");
	}

	public void journey(String startPlace, String destPlace) {
		
		System.out.println("journey has started at ::"+startPlace);
		System.out.println("jouney is going on ......");
		engine.start();
		System.out.println("journey is ended at::"+destPlace);
	}

}
