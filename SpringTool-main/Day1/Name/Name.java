package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name{
	@GetMapping("/llo/{str}")
	public String Name(@PathVariable String str)
	{
		return "Hello"+str+"!";
	}
}