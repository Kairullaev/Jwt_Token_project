package com.example.jwt_token_project.responseView;

import com.example.jwt_token_project.dto.response.CompanyResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyResponseView {
    private List<CompanyResponse> companyResponses;
    private int currentPage;
    private int totalPage;

}
