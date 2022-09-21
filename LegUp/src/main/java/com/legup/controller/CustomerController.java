package com.legup.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/")
	public String welcome() {
		return "Hello Rohan!!  Current time is  "+ LocalDateTime.now();
	}
}
