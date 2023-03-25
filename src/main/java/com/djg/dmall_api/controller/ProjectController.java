package com.djg.dmall_api.controller;


import com.djg.dmall_api.service.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

/**
 * @author mac
 */
@RestController
@CrossOrigin(value = "*")
public class ProjectController {

    final
    ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping(value = "/newProject")
    public String newProject(){
        return  null   ;
    };

    @GetMapping(value = "/delProject")
    public String delProject(){
        return  null   ;
    };

    @PostMapping(value = "/updateProject")
    public String updateProject(){
        return  null   ;
    };


    @GetMapping(value = "/getProjectList")
    public String getProjectList(@RequestParam("serachText") String projectName) throws JsonProcessingException {
        return projectService.getProjectList(projectName);
    }
}