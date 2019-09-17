package com.vvn13.diary2.repository;

import com.vvn13.diary2.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository
        extends JpaRepository<Subject, Integer> {
    Subject findById(int subjectId);
}
