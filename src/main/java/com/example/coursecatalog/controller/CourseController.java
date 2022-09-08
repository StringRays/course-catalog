package com.example.coursecatalog.controller;

import com.example.coursecatalog.entity.Course;
import com.example.coursecatalog.service.CourseService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/course")
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/all")
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @PostMapping("/add")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }
}
