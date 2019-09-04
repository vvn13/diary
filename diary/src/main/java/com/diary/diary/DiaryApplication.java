package com.diary.diary;

import com.diary.diary.model.Student;
import com.diary.diary.model.Subject;
import com.diary.diary.model.SubjectMark;
import com.diary.diary.service.SubjectMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DiaryApplication {
    @Autowired
    private SubjectMarkService subjectMarkService;

    public static void main(String[] args) {
        SpringApplication.run(DiaryApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void test(){
        Student student = new Student();
        student.setFirstName("oi");
        student.setLastName("po");

        Subject subject = new Subject();
        subject.setTitle("Rus");

        SubjectMark subjectMark = new SubjectMark();
        subjectMark.setStudent(student);
        subjectMark.setSubject(subject);
        subjectMark.setMark(5);


        subjectMarkService.createSubjectMark(subjectMark);
    }
}
