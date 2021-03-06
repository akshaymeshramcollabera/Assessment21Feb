package com.crud.spring.service;

import java.util.List;

import com.crud.spring.model.Course;

public interface CourseService {
	public List<Course> getAllCourse();

	public Course saveCourse(Course course);
	
	public Course updateCourse(Course course);

	public String deleteCourse(Course course);
}
