package com.example.jwt_token_project.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoRequest {
    private String videoName;
    private String link;
    private Long lessonId;
}
