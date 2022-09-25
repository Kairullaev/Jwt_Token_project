package com.example.jwt_token_project.dto.requests;
import com.example.jwt_token_project.enums.StudyFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegisterRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;
    private StudyFormat studyFormat;
    private String password;


}
