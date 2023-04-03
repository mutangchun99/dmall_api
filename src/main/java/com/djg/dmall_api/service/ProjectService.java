package com.djg.dmall_api.service;

import com.djg.dmall_api.po.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

/**
 * @author mac
 */
@Service
public interface ProjectService {
    /**
     * @return
     */
    String newProject(Project project) throws JsonProcessingException;

    String delProject(String id) throws JsonProcessingException;

    String updateProject(Project project) throws JsonProcessingException;;

    String getProjectLists(Integer pageNum, Integer pageSize,String projectName) throws JsonProcessingException;
}
