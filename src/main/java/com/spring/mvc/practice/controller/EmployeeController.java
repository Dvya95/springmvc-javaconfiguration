package com.spring.mvc.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/sayHello")
	public String sayHello(){
		return "display.jsp";
	}
}
