package com.task.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @RequestMapping("/addTest")
    public void addTest() {
        projectsService.addProject();
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Project> getProjects() {
        System.out.println(projectsService.getAllProjects());
        return projectsService.getAllProjects();
    }

    @RequestMapping("/{id}")
    public String getProject(@PathVariable String id) {
        System.out.println(projectsService.getProjectById(id));
        return projectsService.getProjectById(id).toString();
    }
}
