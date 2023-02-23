package com.example.demo.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employees;
import com.example.demo.repo.EmployeeRepo;

@Service
public class StudentService 
{
	@Autowired
	private EmployeeRepo stu;
	
	public Employees addDetails(Employees s)
	{
		return stu.save (s) ;
	}
	public List<Employees>getAllDetails ()
	{
		List<Employees>arr= new ArrayList<> () ;
		arr= stu.findAll();
		return arr;
	}
	public void deleteDepartmentById(int id)
	{
		stu.deleteById(id);
	}
}
