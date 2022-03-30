package me.dio.challengeBootcamp.entities;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.title = "Curso Java";
		course1.description = "Programação OOP Java";
		course1.setWorkload(8);
		
		Course course2 = new Course();
		course2.title = "Curso Python";
		course2.description = "Programação OOP Python";
		course2.setWorkload(6);
		
		Mentorships mentorships1 = new Mentorships();
		mentorships1.title = "Mentoria Java";
		mentorships1.description = "Mentoria de Java para QA";
		mentorships1.setMentoringDate(LocalDate.now()); //the opening of the mentorship will be generated in the
														//instance of the object
		
//		System.out.println(course1);
//		System.out.println(course2);
//		System.out.println(mentorships1);
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setName("Bootcamp JAVA DIO - GFT");
		bootcampJava.setDescription("JAVA 17");
		bootcampJava.getContents().add(course1);
		bootcampJava.getContents().add(course2);
		bootcampJava.getContents().add(mentorships1);
		
		Dev dev = new Dev();
		dev.setName("Jose");
		dev.writeBootcamp(bootcampJava);
		dev.progress();
		dev.progress();
		dev.progress();
		dev.progress();
		System.out.println("Content Registered: " + dev.getName() + " = " + dev.getContentRegistered());
		System.out.println("Content Concluded: " + dev.getName() + " = " + dev.getContentConcluded());
		System.out.println("XP: " + dev.calcTotalXP());
		
		System.out.println();
		
		Dev dev1 = new Dev();
		dev1.setName("Rosa");
		dev1.writeBootcamp(bootcampJava);
		dev1.progress();
		System.out.println("Content Registered: " + dev1.getName() + " = " + dev1.getContentRegistered());
		System.out.println("Content Concluded: " + dev1.getName() + " = " + dev1.getContentConcluded());
		System.out.println("XP: " + dev1.calcTotalXP());
	}
}
