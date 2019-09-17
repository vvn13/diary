package com.vvn13.diary2.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StudentDto {
    private int studentId;
    private String lastName;
    private String firstName;
}
