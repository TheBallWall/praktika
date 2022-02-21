package com.task.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectsService {
    @Autowired
    private ProjectsRepository projectsRepository;

    public void addProject(){
        projectsRepository.save(new Project("2","testProject","TEST PROJECT"));
    }

    public List<Project> getAllProjects(){
        return projectsRepository.findAll();
    }

    public Optional<Project> getProjectById(String id){
        return projectsRepository.findById(id);
    }
}
