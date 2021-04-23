package com.projectlist.mapper;

import com.projectlist.dto.ProjectsDTO;
import com.projectlist.model.Projects;
import org.springframework.stereotype.Component;

@Component
public class ProjectsMapper {
    public Projects fromDTO(ProjectsDTO projectsDTO){
        Projects projects = new Projects();
        projects.setId(projectsDTO.getId());
        projects.setProjectName(projectsDTO.getProjectName());
        projects.setOrderingParty(projectsDTO.getOrderingParty());
        projects.setProductsImpacted(projectsDTO.getProductsImpacted());
        projects.setStartDate(projectsDTO.getStartDate());
        projects.setEndDate(projectsDTO.getEndDate());
        projects.setStatus(projectsDTO.getStatus());
        return projects;
    }
    public ProjectsDTO toDTO(Projects projects) {
        ProjectsDTO projectsDTO = new ProjectsDTO();
        projectsDTO.setId(projects.getId());
        projectsDTO.setProjectName(projects.getProjectName());
        projectsDTO.setOrderingParty(projects.getOrderingParty());
        projectsDTO.setProductsImpacted(projects.getProductsImpacted());
        projectsDTO.setStartDate(projects.getStartDate());
        projectsDTO.setEndDate(projects.getEndDate());
        projectsDTO.setStatus(projects.getStatus());
        return projectsDTO;
    }

}
