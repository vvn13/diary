package com.vvn13.diary2.service;

import com.vvn13.diary2.model.Subject;
import com.vvn13.diary2.repository.SubjectRepository;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public void addSubject(int subjectId, String title) {
        Subject subject = Subject.builder()
                .subjectId(subjectId)
                .title(title)
                .build();
        subjectRepository.save(subject);
    }
}
