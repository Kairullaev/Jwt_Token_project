package com.example.jwt_token_project.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentRegisterRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;
    private String password;


}
