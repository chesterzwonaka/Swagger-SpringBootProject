package com.chestermabulela.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chestermabulela.swagger.entity.Course;
import com.chestermabulela.swagger.repository.CourseRepository;

@Service
public class CourseService {
	
@Autowired
private CourseRepository courseRepository;

public String saveCourse(Course course) {
	courseRepository.save(course);
	return "Course saved with Id: " + course.getCourseId(); 
}

public List<Course> fetchAllCourse()
{
  return courseRepository.findAll();
}

public List<Course> deleteCourseById(int courseId)
{
   courseRepository.deleteById(courseId);
   return courseRepository.findAll();
}





}
