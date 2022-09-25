package com.example.jwt_token_project.dto.response;
import com.example.jwt_token_project.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegisterResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String token;
    private Role role;
}
