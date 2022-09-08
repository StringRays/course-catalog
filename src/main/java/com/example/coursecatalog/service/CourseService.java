package com.example.coursecatalog.service;

import java.util.List;

import com.example.coursecatalog.entity.Course;

public interface CourseService {
    List<Course> getAll();

    void addCourse(Course course);
}
