package com.softtek.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("petrol")
@Lazy(true)
public class PetrolEngine implements Iengine {

	public PetrolEngine() {
		super();
		System.out.println("PetrolEngine o - param constructor");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
     System.out.println("petrol engine :: started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		   System.out.println("petrol engine :: stopped");

	}

}
