package com.softtek.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Diesel")
@Lazy(true)
public class DieselEngine implements Iengine {
	

	public DieselEngine() {
		super();
		System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		 System.out.println("diesel engine :: started");

	}

	@Override
	public void stop() {
		 System.out.println("diesel engine :: stopped");

	}

}
