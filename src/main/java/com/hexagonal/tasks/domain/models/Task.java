package com.hexagonal.tasks.domain.models;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdOn;
    private boolean isCompleted;

    public Task(Long id, String title, String description, LocalDateTime createdOn, boolean isComplete) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdOn = createdOn;
        this.isCompleted = isComplete;
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

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean complete) {
        isCompleted = complete;
    }
}
