package com.ibrahimbayburtlu.springdatademo.repository;

import com.ibrahimbayburtlu.springdatademo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
