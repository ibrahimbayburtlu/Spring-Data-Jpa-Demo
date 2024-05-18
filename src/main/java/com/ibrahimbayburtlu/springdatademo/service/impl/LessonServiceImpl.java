package com.ibrahimbayburtlu.springdatademo.service.impl;

import com.ibrahimbayburtlu.springdatademo.entity.Lesson;
import com.ibrahimbayburtlu.springdatademo.repository.LessonRepository;
import com.ibrahimbayburtlu.springdatademo.service.LessonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonService {

    private LessonRepository lessonRepository;

    @Override
    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    @Override
    public Optional<Lesson> findById(Long id) {
        return lessonRepository.findById(id);
    }

    @Override
    public Lesson save(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public void deleteById(Long id) {
        lessonRepository.deleteById(id);
    }
}
