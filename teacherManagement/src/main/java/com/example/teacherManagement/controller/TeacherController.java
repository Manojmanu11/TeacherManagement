package com.example.teacherManagement.controller;

import com.example.teacherManagement.entity.Course;
import com.example.teacherManagement.entity.Teacher;
import com.example.teacherManagement.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping
    public Teacher add(@RequestBody Teacher teacher){
        return teacherService.add(teacher);
    }
    @GetMapping
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }
    @DeleteMapping
    public void   delete(@PathVariable Long id){
        teacherService.delete(id);
    }
    @PutMapping
    public Teacher update(@PathVariable Long id,@RequestBody Teacher teacher){
        return teacherService.update(id,teacher);
    }
}
