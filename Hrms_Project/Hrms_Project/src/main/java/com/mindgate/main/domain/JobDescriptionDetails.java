package com.mindgate.main.domain;

import java.util.Objects;

public class JobDescriptionDetails {
	   private int    jobId ;
	   private  int   employeeId ;
	   private  String  skill1 ;
	   private  String   skill2 ;
	   private  String   skill3 ;
	   private  String   projectId ;
	   private  String   jobStatus ;
	   private  int   RequiredCandidate;
	   
	   public JobDescriptionDetails() {
		// TODO Auto-generated constructor stub
	}

	public JobDescriptionDetails(int jobId, int employeeId, String skill1, String skill2, String skill3,
			String projectId, String jobStatus, int requiredCandidate) {
		super();
		this.jobId = jobId;
		this.employeeId = employeeId;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.projectId = projectId;
		this.jobStatus = jobStatus;
		RequiredCandidate = requiredCandidate;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public int getRequiredCandidate() {
		return RequiredCandidate;
	}

	public void setRequiredCandidate(int requiredCandidate) {
		RequiredCandidate = requiredCandidate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RequiredCandidate, employeeId, jobId, jobStatus, projectId, skill1, skill2, skill3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobDescriptionDetails other = (JobDescriptionDetails) obj;
		return RequiredCandidate == other.RequiredCandidate && employeeId == other.employeeId && jobId == other.jobId
				&& Objects.equals(jobStatus, other.jobStatus) && Objects.equals(projectId, other.projectId)
				&& Objects.equals(skill1, other.skill1) && Objects.equals(skill2, other.skill2)
				&& Objects.equals(skill3, other.skill3);
	}

	@Override
	public String toString() {
		return "JobDescriptionDetails [jobId=" + jobId + ", employeeId=" + employeeId + ", skill1=" + skill1
				+ ", skill2=" + skill2 + ", skill3=" + skill3 + ", projectId=" + projectId + ", jobStatus=" + jobStatus
				+ ", RequiredCandidate=" + RequiredCandidate + "]";
	}

}
