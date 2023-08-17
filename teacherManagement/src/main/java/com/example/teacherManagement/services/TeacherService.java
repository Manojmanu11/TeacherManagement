package com.example.teacherManagement.services;

import com.example.teacherManagement.entity.Teacher;
import com.example.teacherManagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;


    public Teacher add(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAll(){
        return teacherRepository.findAll();

    }
    public void delete(Long id){
        teacherRepository.deleteById(id);
    }

    public Teacher update(Long id,Teacher updateTeacher){
        Optional<Teacher> optionalUser = teacherRepository.findById(id);
        if (optionalUser.isPresent()) {
            Teacher teacher1 = optionalUser.get();
            teacher1.setName(updateTeacher.getName());
            return teacherRepository.save(teacher1);
        }
        return null;
    }



}
