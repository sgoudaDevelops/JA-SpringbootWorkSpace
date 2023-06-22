package com.softtek;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.softtek.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BasicProj01Application {
	@Bean("ldt")
	public LocalDateTime createLDT() {
		System.out.println("BasicProj01Application.createLDT()");
		return LocalDateTime.now();

	}

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(BasicProj01Application.class, args);
		WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.showMessgae("Ram"));
		((ConfigurableApplicationContext) factory).close();// optional but recommended
	}

}
