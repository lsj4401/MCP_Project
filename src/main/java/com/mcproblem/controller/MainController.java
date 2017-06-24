package com.mcproblem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

@Controller
public class MainController {

	@PostConstruct
	public void init() {
		System.out.println("test");
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "/index";
	}
}
