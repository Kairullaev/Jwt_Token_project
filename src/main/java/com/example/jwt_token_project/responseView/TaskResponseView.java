package com.example.jwt_token_project.responseView;


import com.example.jwt_token_project.dto.response.TaskResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TaskResponseView {
    List<TaskResponse> taskResponses;
}
