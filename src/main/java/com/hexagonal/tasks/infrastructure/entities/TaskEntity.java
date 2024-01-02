package com.hexagonal.tasks.infrastructure.entities;

import com.hexagonal.tasks.domain.models.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @CreationTimestamp
    private LocalDateTime createdOn;
    private boolean isCompleted;

    public static TaskEntity fromDomainModel(Task task) {
        return new TaskEntity(task.getId(), task.getTitle(), task.getDescription(),
                task.getCreatedOn(), task.isCompleted());
    }

    public Task toDomainModel() {
        return new Task(id, title, description, createdOn, isCompleted);
    }

    public TaskEntity() {
    }

    public TaskEntity(Long id, String title, String description, LocalDateTime createOn, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdOn = createOn;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreateOn(LocalDateTime createOn) {
        this.createdOn = createOn;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setComplete(boolean complete) {
        isCompleted = complete;
    }
}
