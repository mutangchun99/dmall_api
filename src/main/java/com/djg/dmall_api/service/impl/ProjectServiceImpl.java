package com.djg.dmall_api.service.impl;

import com.djg.dmall_api.common.utils.Result;
import com.djg.dmall_api.dao.ProjectMapper;
import com.djg.dmall_api.po.Project;
import com.djg.dmall_api.service.ProjectService;
import com.djg.dmall_api.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public String newProject(Project project) throws JsonProcessingException {
        Boolean status = false;
        try {
            status = projectMapper.newProject(project);
            return JsonUtils.getJson(Result.success("添加成功！！"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonUtils.getJson(Result.error());
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
        List<Project> lproject = projectMapper.getProjectList(projectName);
        return JsonUtils.getJson(Result.success("查询成功！", lproject));
    }

    @Override
    public String getProjectLists(Integer pageNum, Integer pageSize) throws JsonProcessingException {
        PageHelper.startPage(pageNum, pageSize);
        List<Project> projects = projectMapper.getProjectLists();
        PageInfo<Project> pageInfo = new PageInfo<>(projects);
        return JsonUtils.getJson(Result.success("查询成功", pageInfo));


    }
}
