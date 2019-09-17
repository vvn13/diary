package com.vvn13.diary2.controller;

import com.vvn13.diary2.dto.SubjectMarkDto;
import com.vvn13.diary2.service.SubjectMarkService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mark")
public class SubjectMarkController {

    private final SubjectMarkService subjectMarkService;

    public SubjectMarkController(SubjectMarkService subjectMarkService) {
        this.subjectMarkService = subjectMarkService;
    }

    @PostMapping("/add")
    public void addMark(@RequestBody SubjectMarkDto subjectMarkDto) {
        subjectMarkService.addMark(subjectMarkDto.getMarkId(), subjectMarkDto.getStudentId(), subjectMarkDto.getSubjectId(), subjectMarkDto.getMark());
    }
}
