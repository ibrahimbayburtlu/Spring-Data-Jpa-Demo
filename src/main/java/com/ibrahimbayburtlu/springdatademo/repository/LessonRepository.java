package com.ibrahimbayburtlu.springdatademo.repository;

import com.ibrahimbayburtlu.springdatademo.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Long> {

    // Dersleri isimlerine göre bulmak için bir sorgu
    List<Lesson> findLessonsByName(String name);

}
