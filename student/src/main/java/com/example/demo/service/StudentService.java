package com.example.demo.service;

import java.awt.PrintGraphics;
import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	void add(Student s);
	List<Student>display();
	void delete(Integer id);
	Student update(Student s,Integer id);

}
