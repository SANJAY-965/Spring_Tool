package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Employees;

@RestController
public class EmployeeController {
	@Autowired
	private StudentService stuservice;
	
	@GetMapping("/get")
	public List<Employees>getDetails()
	{
		return stuservice.getAllDetails();
	}
	@PostMapping("/add")
	public Employees addDetails(@RequestBody Employees s)
	{
		return stuservice.addDetails(s);
	}
}
