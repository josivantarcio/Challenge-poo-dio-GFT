package me.dio.challengeBootcamp.entities;

import java.time.LocalDate;

public class Mentorships extends Content {
	
	private LocalDate mentoringDate;
	
	public LocalDate getMentoringDate() {
		return mentoringDate;
	}

	public void setMentoringDate(LocalDate mentoringDate) {
		this.mentoringDate = mentoringDate;
	}

	@Override
	public String toString() {
		return "Mentorships Title: "+ super.title
				+ ", Descrition: " + super.description
				+ ", MentoringDate: " + mentoringDate;
	}

	@Override
	public double calculeteXP() {
		return super.XP_PADRAO + 20;
		
	}
}
