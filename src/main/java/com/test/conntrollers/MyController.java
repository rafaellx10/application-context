package com.test.conntrollers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		System.out.println("Hello There!!");
		
		return "foo";
	}
}
