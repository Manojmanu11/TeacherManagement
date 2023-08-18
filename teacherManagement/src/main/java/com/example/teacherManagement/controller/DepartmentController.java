package com.example.teacherManagement.controller;

import com.example.teacherManagement.entity.Course;
import com.example.teacherManagement.entity.Department;
import com.example.teacherManagement.services.CourseService;
import com.example.teacherManagement.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping
    public Department add(@RequestBody Department department){
        return departmentService.add(department);
    }
    @GetMapping
    public List<Department> getAll(){
        return departmentService.get();
    }
//    @DeleteMapping
//    public void   delete(@PathVariable Long id){
//         courseService.delete(id);
//    }
//    @PutMapping
//    public Course update(@PathVariable Long id,@RequestBody Course course){
//        return courseService.update(id,course);
//    }
}
