package com.ibrahimbayburtlu.springdatademo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Lesson_Table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Lesson_Name", nullable = false)
    private String name;

    @Column(name = "Phone_Number", nullable = false)
    private String phoneNumber;

    @ManyToMany(mappedBy = "lessons")
    private List<Student> students;

    @ManyToMany(mappedBy = "lessons")
    private List<Teacher> teachers;

}
