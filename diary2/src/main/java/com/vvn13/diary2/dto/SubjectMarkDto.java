package com.vvn13.diary2.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SubjectMarkDto {
    private int markId;
    private int studentId;
    private int subjectId;
    private int mark;
}
