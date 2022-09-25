package com.example.jwt_token_project.responseView;


import com.example.jwt_token_project.dto.response.LessonResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class LessonResponseView {

    List<LessonResponse> lessonResponses;
}
