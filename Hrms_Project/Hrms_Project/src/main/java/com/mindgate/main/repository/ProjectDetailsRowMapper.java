package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.domain.ProjectDetails;

public class ProjectDetailsRowMapper implements RowMapper<ProjectDetails> {

	@Override
	public ProjectDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		 String projectId=rs.getString("project_Id");
		 String projectName=rs.getString("project_Name");
		 int projectCost=rs.getInt("project_Cost");
		 ProjectDetails projectDetails=new ProjectDetails(projectId, projectName, projectCost);
		 
		return projectDetails;
	}

}


