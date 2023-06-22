package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.softtek.sbeans.Hotel;

@SpringBootApplication
public class BasicProj04ValueAnnoatationSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BasicProj04ValueAnnoatationSpelApplication.class, args);
		Hotel hotel = ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		((ConfigurableApplicationContext)ctx).close();
	}

}
