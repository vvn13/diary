package com.vvn13.diary2.controller;

import com.vvn13.diary2.dto.SubjectDto;
import com.vvn13.diary2.service.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/add")
    public void addSubject(@RequestBody SubjectDto subjectDto) {
        subjectService.addSubject(subjectDto.getSubjectId(), subjectDto.getTitle());
    }
}
