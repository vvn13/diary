package com.diary.diary.repository;

import com.diary.diary.model.SubjectMark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectMarkRepository
        extends JpaRepository<SubjectMark, Long> { }
