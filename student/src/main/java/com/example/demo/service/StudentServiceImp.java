package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
		@Autowired
		private StudentRepository sr;

	@Override
	public void add(Student s) {
	sr.save(s);

	}

	@Override
	public List<Student> display() {	
		return sr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
	}

	@Override
	public Student update(Student s, Integer id) {
		// TODO Auto-generated method stub
		s.setRoll(id);
		
		return sr.save(s);
	}

}
