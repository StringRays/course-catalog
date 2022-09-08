package com.example.coursecatalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.coursecatalog.entity.Course;
import com.example.coursecatalog.repository.CourseRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }
    
}
