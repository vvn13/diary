package com.vvn13.diary2.repository;

import com.vvn13.diary2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student, Integer> {
    Student findById(int studentId);
}
