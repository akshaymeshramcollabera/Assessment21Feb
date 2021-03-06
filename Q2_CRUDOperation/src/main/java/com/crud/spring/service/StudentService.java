package com.crud.spring.service;

import java.util.List;

import com.crud.spring.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public String deleteStudent(Student student);
}
