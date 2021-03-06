package com.crud.spring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.model.Student;
import com.crud.spring.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/get")
	public List<Student> obtainAllStudent(){
		return studentServiceImpl.getAllStudents(); 
	}
	
	@PostMapping("/post")
	public Student storeStudent(@RequestBody Student student) {
		return studentServiceImpl.saveStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
	
	@DeleteMapping("/delete")
	public String eraseStudent(@RequestBody Student student) {
		studentServiceImpl.deleteStudent(student);
		return "Deleted"+student;
	}
}
