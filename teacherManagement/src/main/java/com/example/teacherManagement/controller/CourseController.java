package com.example.teacherManagement.controller;

import com.example.teacherManagement.entity.Course;
import com.example.teacherManagement.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping
    public Course add(@RequestBody Course course){
        return courseService.add(course);
    }
    @GetMapping
    public List<Course> getAll(){
        return courseService.getAllCourses();
    }
    @DeleteMapping
    public void   delete(@PathVariable Long id){
         courseService.delete(id);
    }
    @PutMapping
    public Course update(@PathVariable Long id,@RequestBody Course course){
        return courseService.update(id,course);
    }
}
