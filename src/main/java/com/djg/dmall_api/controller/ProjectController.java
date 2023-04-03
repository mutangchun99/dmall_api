package com.djg.dmall_api.controller;


import com.djg.dmall_api.po.Project;
import com.djg.dmall_api.service.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
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
    public String newProject(@RequestBody Project project) throws JsonProcessingException {
        return projectService.newProject(project);
    }

    ;

    @GetMapping(value = "/delProject")
    public String delProject(@RequestParam(value = "id") String id) throws JsonProcessingException {
        return projectService.delProject(id);
    }

    ;

    @PostMapping(value = "/updateProject")
    public String updateProject() {
        return null;
    }

    ;

    @GetMapping(value = "/getProjectLists")
    public String getProjectLists(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize, @RequestParam("serachText") String projectName) throws JsonProcessingException {

        return projectService.getProjectLists(pageNum, pageSize, projectName);
    }
}