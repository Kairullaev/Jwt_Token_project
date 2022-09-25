package com.example.jwt_token_project.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LessonRequest {
    private String lessonName;
    private Long courseId;
}
