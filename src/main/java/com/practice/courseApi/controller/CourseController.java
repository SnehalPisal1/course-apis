package com.practice.courseApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.courseApi.bean.Course;
import com.practice.courseApi.service.CourseServiceImpl;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@PostMapping
	public Course addCourse(@RequestBody Course course) {
		System.out.println("Inside add course");
		return courseServiceImpl.addCourse(course);
	}
	
	@GetMapping
	public List<Course> getAllCourse(){
		return courseServiceImpl.getAllCourse();		
	}

	@GetMapping("/{courseId}")
	public Course getCourseById(@PathVariable Integer courseId){
		return courseServiceImpl.getCourseById(courseId);	
	}
	

}
