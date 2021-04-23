package com.projectlist.mapper;

import com.projectlist.dto.TasksDTO;
import com.projectlist.model.Tasks;
import org.springframework.stereotype.Component;

@Component
public class TasksMapper {
    public Tasks fromDTO(TasksDTO tasksDTO){
        Tasks tasks = new Tasks();
        tasks.setId(tasksDTO.getId());
        tasks.setTaskName(tasksDTO.getTaskName());
        tasks.setDesctription(tasksDTO.getDescription());
        tasks.setStatus(tasks.getStatus());
        return tasks;
    }

    public TasksDTO toDTO(Tasks tasks){
        TasksDTO tasksDTO = new TasksDTO();
        tasksDTO.setId(tasks.getId());
        tasksDTO.setTaskName(tasks.getTaskName());
        tasksDTO.setDescription(tasks.getDesctription());
        tasksDTO.setStatus(tasks.getStatus());
        return tasksDTO;
    }



}
