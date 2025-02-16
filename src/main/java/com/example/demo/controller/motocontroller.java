package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class motocontroller {
	@GetMapping("/moto")
	public String moto() {
		//HTML=test.html
		return  "test";
	}

}
