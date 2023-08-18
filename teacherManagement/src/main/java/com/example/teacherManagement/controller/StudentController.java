package com.example.teacherManagement.controller;

import com.example.teacherManagement.entity.Student;
import com.example.teacherManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping
    public Student add(Student student) {
        return studentService.add(student);

    }
    @GetMapping
    public List<Student> get() {
        return studentService.get();
    }
}
