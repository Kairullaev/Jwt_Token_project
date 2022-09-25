package com.example.jwt_token_project.api;


import com.example.jwt_token_project.dto.requests.VideoRequest;
import com.example.jwt_token_project.dto.response.VideoResponse;
import com.example.jwt_token_project.services.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/video")
@PreAuthorize("hasAuthority('ADMIN')")
public class VideoController {
    private final VideoService videoService;


    @PostMapping("/saveVideo")
    public VideoResponse saveVideo(@RequestBody VideoRequest videoRequest) {
        return videoService.saveVideo(videoRequest);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('MANAGER')")
    public VideoResponse getVideoById(@PathVariable Long id) {
        return videoService.getVideoById(id);
    }
    @PutMapping("/{id}")
    public VideoResponse updateVideoById(@PathVariable Long id,
                                         @RequestBody VideoRequest videoRequest) {
        return videoService.updateVideoById(id, videoRequest);
    }

    @DeleteMapping("/{id}")
    public VideoResponse deleteVideoById(@PathVariable Long id) {
        return videoService.deleteById(id);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('MANAGER')")
    public List<VideoResponse> getAllVideos() {
        return videoService.getAllVideos();
    }
}
