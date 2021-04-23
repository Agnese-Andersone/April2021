package com.projectlist.dto;

import com.projectlist.model.Tasks;

import java.util.Set;

public class ProjectsDTO {
    private Long id;
    private String projectName;
    private String orderingParty;
    private String productsImpacted;
    private String startDate;
    private String endDate;
    private String status;
    private Set<TasksDTO> tasksDTOSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOrderingParty() {
        return orderingParty;
    }

    public void setOrderingParty(String orderingParty) {
        this.orderingParty = orderingParty;
    }

    public String getProductsImpacted() {
        return productsImpacted;
    }

    public void setProductsImpacted(String productsImpacted) {
        this.productsImpacted = productsImpacted;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<TasksDTO> getTasksDTOSet() {
        return tasksDTOSet;
    }

    public void setTasksDTOSet(Set<TasksDTO> tasksDTOSet) {
        this.tasksDTOSet = tasksDTOSet;
    }
}
