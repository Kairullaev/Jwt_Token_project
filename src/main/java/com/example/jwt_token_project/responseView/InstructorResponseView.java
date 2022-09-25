package com.example.jwt_token_project.responseView;


import com.example.jwt_token_project.dto.response.InstructorResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InstructorResponseView {
    List<InstructorResponse> instructorResponses;
    private int currentPage;
    private int totalPage;

}
