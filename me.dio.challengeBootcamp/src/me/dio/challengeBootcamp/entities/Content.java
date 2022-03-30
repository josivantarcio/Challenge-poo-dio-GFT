package me.dio.challengeBootcamp.entities;

public abstract class Content {
	
	/*
	 * The Gets() and Sets() were not created because the attributes are protected 
	 * with access only for the child classes.
	 */
	
	protected String title;
	protected String description;
	protected final double XP_PADRAO = 10;
	
	public abstract double calculeteXP();
	
}
