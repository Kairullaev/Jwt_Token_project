package com.example.jwt_token_project.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyRequest {
    private String companyName;
    private String locatedCountry;

}
