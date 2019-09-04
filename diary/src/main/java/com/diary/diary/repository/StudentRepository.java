package com.diary.diary.repository;

import com.diary.diary.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
    extends JpaRepository<Student, Long> { }
