package com.vvn13.diary2.controller;

import com.vvn13.diary2.dto.StudentDto;
import com.vvn13.diary2.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDto studentDto) {
        studentService.addStudent(studentDto.getStudentId(), studentDto.getFirstName(), studentDto.getLastName());
    }
}
