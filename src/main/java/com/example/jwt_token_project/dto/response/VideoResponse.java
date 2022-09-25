package com.example.jwt_token_project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VideoResponse {
    private Long id;
    private String videoName;
    private String link;
    private Long lessonId;
    private String lessonName;
}
