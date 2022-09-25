package com.example.jwt_token_project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {

    private Long id;
    private String courseName;
    private int duration;
    private String image;
    private String description;
    private LocalDate dateOfStart;
    private String companyName;

}
