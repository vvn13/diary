package com.vvn13.diary2.service;

import com.vvn13.diary2.model.SubjectMark;
import com.vvn13.diary2.repository.StudentRepository;
import com.vvn13.diary2.repository.SubjectMarkRepository;
import com.vvn13.diary2.repository.SubjectRepository;
import org.springframework.stereotype.Service;

@Service
public class SubjectMarkService {

    private final SubjectMarkRepository subjectMarkRepository;
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;

    public SubjectMarkService(SubjectMarkRepository subjectMarkRepository, StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.subjectMarkRepository = subjectMarkRepository;
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    public void addMark(int markId, int studentId, int subjectId, int mark) {
        SubjectMark subjectMark = SubjectMark.builder()
                .markId(markId)
                .students(studentRepository.findById(studentId))
                .subjects(subjectRepository.findById(subjectId))
                .mark(mark)
                .build();
        subjectMarkRepository.save(subjectMark);


    }
}
