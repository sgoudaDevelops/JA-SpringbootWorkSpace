package com.softtek.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("electric")
@Lazy
public class ElectricEngine implements Iengine {
	

	public ElectricEngine() {
		super();
		System.out.println("ElectricEngine.ElectricEngine()");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		 System.out.println("elctrical engine :: started");

	}

	@Override
	public void stop() {
		 System.out.println("elctrical engine :: stopped");

	}

}
