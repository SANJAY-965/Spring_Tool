package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color{
	@RequestMapping(value="/MyFav/{color}",method=RequestMethod.GET)
	@GetMapping("/Hello")
	public String getMyFav(@PathVariable String color)
	{
		return "My favorite color is "+color;
	}
}