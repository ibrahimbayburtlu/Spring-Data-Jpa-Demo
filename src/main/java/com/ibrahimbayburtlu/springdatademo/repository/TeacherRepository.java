package com.ibrahimbayburtlu.springdatademo.repository;

import com.ibrahimbayburtlu.springdatademo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
