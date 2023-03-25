package com.djg.dmall_api.service;

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
    String newProject();

    String delProject();

    String updateProject();

    String getProjectList(String projectName) throws JsonProcessingException;
}
