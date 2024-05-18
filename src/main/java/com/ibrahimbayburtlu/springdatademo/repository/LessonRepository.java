package com.ibrahimbayburtlu.springdatademo.repository;

import com.ibrahimbayburtlu.springdatademo.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Long> {
}
