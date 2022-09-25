package com.example.jwt_token_project.repository;

import com.example.jwt_token_project.dto.response.LessonResponse;
import com.example.jwt_token_project.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long > {
    List<Lesson> getLessonByCourseId(Long courseId);

    @Query("select new com.example.jwt_token_project.dto.response.LessonResponse(l.id , l.lessonName ,l.course.courseName)from Lesson l")
    List<LessonResponse> getAllLessons();

}
