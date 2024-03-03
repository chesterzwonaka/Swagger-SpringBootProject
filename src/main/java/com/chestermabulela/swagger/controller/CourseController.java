package com.chestermabulela.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chestermabulela.swagger.entity.Course;
import com.chestermabulela.swagger.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/save")
	public String saveCourse(@RequestBody Course course)
	{
		return courseService.saveCourse(course);		
	}
	
	@GetMapping("/getCourse")
	public List<Course> getAllCourse()
	
	{
		return courseService.fetchAllCourse();
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	public List<Course> deleteCourseById(@PathVariable  int courseId)
	{
		return courseService.deleteCourseById(courseId);
	}
	
	
	
}
