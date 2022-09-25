package com.example.jwt_token_project.dto.response;
import com.example.jwt_token_project.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder
@AllArgsConstructor

public class UserResponse {
    private Long id;
    private String email;
    private String token;
    private Role role;

}

