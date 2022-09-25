package com.example.jwt_token_project.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN , INSTRUCTOR , STUDENT;


    @Override
    public String getAuthority() {
        return this.name();
    }
}
