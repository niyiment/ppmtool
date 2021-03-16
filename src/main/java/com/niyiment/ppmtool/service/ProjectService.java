package com.niyiment.ppmtool.service;

import com.niyiment.ppmtool.domain.Project;
import com.niyiment.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){

        return projectRepository.save(project);
    }


}
