package com.example.jwt_token_project.dto.requests;


import com.example.jwt_token_project.dto.response.LoginResponse;
import com.example.jwt_token_project.entities.User;
import com.example.jwt_token_project.enums.Role;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Login {
    public LoginResponse toLoginView(String token, String message, User user) {
        var loginResponse = new LoginResponse();
        if (user != null) {
            getAuthority(loginResponse, user.getRole());
        }
        loginResponse.setMessage(message);
        loginResponse.setJwtToken(token);
        return loginResponse;
    }

    private void getAuthority(LoginResponse loginResponse, Role roles) {
        Set<String> authorities = new HashSet<>();
        authorities.add(roles.getAuthority());
        loginResponse.setAuthorities(authorities);
    }
}
