package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@PostMapping("add")
	public void add(@RequestBody Student s) {
		ss.add(s);
	}
	
	 @GetMapping("display")
	 public List<Student>display(){
		 return ss.display();
	 }
	 
	 @DeleteMapping("delete/{id}")
	 public void delete(@PathVariable("id") Integer roll) {
		 ss.delete(roll);
	 }
	 
	 @PutMapping("update/{id}")
	 public Student update(@PathVariable Integer id, @RequestBody Student s) {
	 	//TODO: process PUT request
	 	
	 	return ss.update(s, id);
	 }
}
