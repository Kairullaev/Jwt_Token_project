package com.example.jwt_token_project.repository;

import com.example.jwt_token_project.dto.response.TaskResponse;
import com.example.jwt_token_project.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("select t from Task t where t.lesson.id = :id")
    List<Task> getTaskByLessonId(@Param("id") Long id);

    @Query("select new com.example.jwt_token_project.dto.response.TaskResponse(t.id,t.taskName,t.taskText,t.deadline," +
            "t.lesson.id,t.lesson.lessonName)from Task t")
    List<TaskResponse> getAllTasks();

}
