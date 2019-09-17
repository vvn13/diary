package com.vvn13.diary2.service;

import com.vvn13.diary2.model.Student;
import com.vvn13.diary2.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(int studentId, String firstName, String lastName) {
        Student student = Student.builder()
                .studentId(studentId)
                .lastName(lastName)
                .firstName(firstName)
                .build();
        studentRepository.save(student);
    }
}
