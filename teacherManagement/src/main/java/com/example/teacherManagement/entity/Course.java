package com.example.teacherManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course_db")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "course")
    private Teacher teacher;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_course_id",referencedColumnName = "id")
//    private List<Book> books;
}
