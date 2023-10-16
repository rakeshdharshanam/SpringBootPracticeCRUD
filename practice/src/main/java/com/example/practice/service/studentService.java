package com.example.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entity.student_entity;
import com.example.practice.repository.studentRepository;

@Service
public class studentService {

	@Autowired
	private studentRepository sr;
	
	public List<student_entity> getNames(){
		List<student_entity> s = sr.findAll();
		return s;
	}

	public int addName(student_entity se) {
		// TODO Auto-generated method stub
		sr.save(se);
		return 1;
	}
	
	public int updateName(student_entity se) {
		// TODO Auto-generated method stub
		sr.save(se);
		return 1;
	}
	
	public int deleteName(Long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);;
		return 1;
	}
	
}
