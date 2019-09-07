package com.vvn13.diary2;

import com.vvn13.diary2.model.ModelsLink;
import com.vvn13.diary2.model.Student;
import com.vvn13.diary2.model.Subject;
import com.vvn13.diary2.model.SubjectMark;
import com.vvn13.diary2.service.ModelsLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Diary2Application {

    @Autowired
    private ModelsLinkService modelsLinkService;

    public static void main(String[] args) {
        SpringApplication.run(Diary2Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void test(){
        Student student = new Student();
        student.setFirstName("Oleg");
        student.setLastName("Petrov");

        Subject subject = new Subject();
        subject.setTitle("Russian");

        SubjectMark subjectMark = new SubjectMark();
        subjectMark.setMark(5);

        ModelsLink modelsLink = new ModelsLink();
        modelsLink.setStudent(student);
        modelsLink.setSubject(subject);
        modelsLink.setSubjectMark(subjectMark);

        modelsLinkService.createModelsLink(modelsLink);
    }
}
