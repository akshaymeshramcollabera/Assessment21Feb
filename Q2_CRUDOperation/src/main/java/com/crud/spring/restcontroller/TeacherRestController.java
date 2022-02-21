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

import com.crud.spring.model.Teacher;
import com.crud.spring.serviceimpl.TeacherServiceImpl;

@RestController
@RequestMapping("/teacher")
public class TeacherRestController {
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
	
	@GetMapping("/get")
	public List<Teacher> obtainAllTeacher(){
		return teacherServiceImpl.getAllTeacher();
	}
	
	@PostMapping("/post")
	public Teacher storeTeacher(@RequestBody Teacher teacher) {
		return teacherServiceImpl.saveTeacher(teacher);
	}
	
	@PutMapping("/update")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return teacherServiceImpl.saveTeacher(teacher);
	}
	
	@DeleteMapping("/delete")
	public String eraseTeacher(@RequestBody Teacher teacher) {
		teacherServiceImpl.deleteTeacher(teacher);
		return "Deleted";
	}
}
