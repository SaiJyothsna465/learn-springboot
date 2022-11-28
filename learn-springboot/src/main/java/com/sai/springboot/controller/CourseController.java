package com.sai.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.springboot.model.Course;


@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveCourses(){
		return Arrays.asList(
				new Course(1,"Springboot","in28min"),
				new Course(2,"learn AWS","infybuzz"));
	}
}
