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

import com.crud.spring.model.Course;
import com.crud.spring.serviceimpl.CourseServiceImpl;

@RestController
@RequestMapping("/course")
public class CourseRestController {
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/get")
	public List<Course> obtainAllCourse(){
		return courseServiceImpl.getAllCourse();
	}
	
	@PostMapping("/post")
	public Course storeCourse(@RequestBody Course course) {
		return courseServiceImpl.saveCourse(course);
	}
	
	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course) {
		return courseServiceImpl.updateCourse(course);
	}
	
	@DeleteMapping("/delete")
	public String eraseCourse(@RequestBody Course course) {
		courseServiceImpl.deleteCourse(course);
		return "Deleted";
	}
}
