package com.ibrahimbayburtlu.springdatademo.service;

import com.ibrahimbayburtlu.springdatademo.entity.Lesson;

import java.util.List;
import java.util.Optional;

public interface LessonService {
    List<Lesson> findAll();
    Optional<Lesson> findById(Long id);
    Lesson save(Lesson lesson);
    void deleteById(Long id);
}
