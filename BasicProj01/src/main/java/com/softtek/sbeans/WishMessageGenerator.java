package com.softtek.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
private LocalDateTime ldt;

	public WishMessageGenerator() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("WishMessageGenerator.o param constructor");
	}
	public String showMessgae(String user)
	{
		System.out.println("WishMessageGenerator.showMessgae()");
		int hour= ldt.getHour();
		if(hour<12) return "Good Morning ::"+user;
		else if(hour<16) return "Good afternoon ::"+user;
		else if(hour<20) return "Good evening ::"+user;
		else return "good night ::"+user;
	}
	
}
