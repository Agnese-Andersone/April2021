package com.projectlist.dto;

import javax.persistence.Column;

public class TasksDTO {

    private Long id;
    private String taskName;
    private String description;
    private String status;
    private ProjectsDTO projectsDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProjectsDTO getProjectsDTO() {
        return projectsDTO;
    }

    public void setProjectsDTO(ProjectsDTO projectsDTO) {
        this.projectsDTO = projectsDTO;
    }
}
