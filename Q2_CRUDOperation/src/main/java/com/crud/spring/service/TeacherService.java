package com.crud.spring.service;

import java.util.List;

import com.crud.spring.model.Teacher;

public interface TeacherService {
	public List<Teacher> getAllTeacher();

	public Teacher saveTeacher(Teacher teacher);
	
	public Teacher updateTeacher(Teacher teacher);

	public String deleteTeacher(Teacher teacher);
}
