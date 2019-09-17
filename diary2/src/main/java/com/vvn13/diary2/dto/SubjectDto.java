package com.vvn13.diary2.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SubjectDto {
    private int subjectId;
    private String title;
}
