package com.chestermabulela.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chestermabulela.swagger.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
