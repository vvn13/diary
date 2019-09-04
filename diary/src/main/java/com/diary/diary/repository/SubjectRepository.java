package com.diary.diary.repository;

import com.diary.diary.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository
    extends JpaRepository<Subject, Long> { }
