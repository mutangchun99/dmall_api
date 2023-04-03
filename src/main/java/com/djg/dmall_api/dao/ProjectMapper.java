package com.djg.dmall_api.dao;

import com.djg.dmall_api.po.Project;

import java.util.List;

/**
 * @author mac
 */
public interface ProjectMapper {
    /**
     * @param projectName
     * @return
     */
//    List<Project> getProjectList(String projectName);

    List<Project> getProjectLists(String projectName);

    Boolean newProject(Project project);

    Boolean delProject(String id);
}