package com.example.jwt_token_project.api;

import com.example.jwt_token_project.dto.requests.UserRequest;
import com.example.jwt_token_project.dto.response.UserResponse;
import com.example.jwt_token_project.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthApi {

    private final UserService userService;


    @PostMapping("/register")
    public UserResponse register(@RequestBody UserRequest authRequest) {
        return userService.create(authRequest);
    }


    @PostMapping("/login")
    public UserResponse login(@RequestBody UserRequest request) {
        return userService.login(request);
    }
}