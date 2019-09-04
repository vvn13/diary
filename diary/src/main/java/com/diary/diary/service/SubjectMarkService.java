package com.diary.diary.service;

import com.diary.diary.model.SubjectMark;
import com.diary.diary.repository.SubjectMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectMarkService {

    @Autowired
    private final SubjectMarkRepository subjectMarkRepository;

    public SubjectMarkService(SubjectMarkRepository subjectMarkRepository){
        this.subjectMarkRepository = subjectMarkRepository;
    }

    public  void createSubjectMark(SubjectMark subjectMark){
        subjectMarkRepository.save(subjectMark);
    }
}
