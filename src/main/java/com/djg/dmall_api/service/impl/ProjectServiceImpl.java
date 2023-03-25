package com.djg.dmall_api.service.impl;

import com.djg.dmall_api.common.utils.Result;
import com.djg.dmall_api.dao.ProjectMapper;
import com.djg.dmall_api.po.Project;
import com.djg.dmall_api.service.ProjectService;
import com.djg.dmall_api.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mac
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    final
    ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    @Override
    public String newProject() {
        return null;
    }

    @Override
    public String delProject() {
        return null;
    }

    @Override
    public String updateProject() {
        return null;
    }

    @Override
    public String getProjectList(String projectName) throws JsonProcessingException {
        Result result =new Result();
        List<Project> lproject = projectMapper.getProjectList(projectName);
        result.setStatus(200);
        result.setMessage("查询成功！");
        result.putData("records",lproject);
        return JsonUtils.getJson(result);
    }
}
