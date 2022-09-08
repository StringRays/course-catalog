package com.example.coursecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.coursecatalog.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
