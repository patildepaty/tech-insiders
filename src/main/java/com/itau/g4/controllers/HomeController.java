package com.itau.g4.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "<h1>API PROJETO FINAL TECH INSIDERS!</h1>";
	}

}
