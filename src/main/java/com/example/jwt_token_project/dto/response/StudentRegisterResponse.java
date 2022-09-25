package com.example.jwt_token_project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentRegisterResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String token;
}
