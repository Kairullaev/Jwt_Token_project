package com.example.jwt_token_project.api;

import com.example.jwt_token_project.dto.requests.InstructorRequest;
import com.example.jwt_token_project.dto.response.InstructorResponse;
import com.example.jwt_token_project.responseView.InstructorResponseView;
import com.example.jwt_token_project.services.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructor")
@PreAuthorize("hasAnyAuthority('ADMIN')")
@RequiredArgsConstructor

public class InstructorController {
    private final InstructorService instructorService;


    @PostMapping
    public InstructorResponse saveInstructor(@RequestBody InstructorRequest instructorRequest) {
        return instructorService.saveInstructor(instructorRequest);
    }

    @GetMapping("/{id}")
    public InstructorResponse getInstructorById(@PathVariable Long id) {
        return instructorService.getInstructorById(id);
    }

    @PutMapping("/{id}")
    public InstructorResponse updateInstructorById(@PathVariable Long id,
                                                   @RequestBody InstructorRequest instructorRequest) {
        return instructorService.updateInstructorById(id, instructorRequest);
    }

    @DeleteMapping("/{id}")
    public InstructorResponse deleteInstructorById(@PathVariable Long id) {
        return instructorService.deleteInstructorById(id);
    }




    @PreAuthorize("hasAnyAuthority('ADMIN','MANAGER')")
    @GetMapping("/all")
    public List<InstructorResponse> getAllInstructor() {
        return instructorService.getAllInstructor();
    }


    @GetMapping("/instructorPagination")
    private InstructorResponseView getAllInstructorPagination(@RequestParam(name = "text", required = false)
                                                              String text,
                                                              @RequestParam int page ,
                                                              @RequestParam int size) {
        return instructorService.getAllInstructorPagination(text,page,size);
    }



    @GetMapping("/{companyName}/count")
    public Long getCountOfInstructorsByCompanyName(@PathVariable String companyName) {
        return instructorService.getCountOfInstructorsByCompanyName(companyName);
    }

    @PostMapping("/{instructorId}/{courseId}/assign")
    public InstructorResponse assignInstructorToCourse(@PathVariable Long instructorId,
                                                      @PathVariable Long courseId) {
        return instructorService.assignInstructorToCourse(instructorId,courseId);
    }

    @PostMapping("/{instructorId}/{courseId}/asString")
    public String  assign(@PathVariable Long instructorId,
                          @PathVariable Long courseId) {
        return instructorService.assign(instructorId,courseId);
    }
}
