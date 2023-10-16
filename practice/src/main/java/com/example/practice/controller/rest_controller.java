package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entity.student_entity;
import com.example.practice.repository.studentRepository;
import com.example.practice.service.studentService;

@RestController
public class rest_controller {
	
	@Autowired
	private studentService ss;
	
	@RequestMapping("/names")
	public List<student_entity>get_name() {
		return ss.getNames();	 
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/addname")
	public int add_name(@RequestBody student_entity se) {
		return ss.addName(se);	 
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatename")
	public int update_name(@RequestBody student_entity se) {
		return ss.updateName(se);	 
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletename/{id}")
	public int update_name(@PathVariable Long id) {
		return ss.deleteName(id);	 
	}
	
	
}
