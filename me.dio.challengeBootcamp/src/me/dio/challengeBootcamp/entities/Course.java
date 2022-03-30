package me.dio.challengeBootcamp.entities;

public class Course extends Content{

	private int workload;

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course Title: " + super.title 
				+ ", Description: " + super.description
				+ ", Workload: " + workload;
	}

	@Override
	public double calculeteXP() {
		 return super.XP_PADRAO * getWorkload();
		
	}
}
