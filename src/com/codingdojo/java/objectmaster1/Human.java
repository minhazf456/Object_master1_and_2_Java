package com.codingdojo.java.objectmaster1;

public class Human {
	
	// attributes
	
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	// constructors 
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	// methods
	
	public Human attack(Human attacked) {
		attacked.health -= this.strength;
		return this;
	}
	public void displayHealth() {
		System.out.println(this.health);
	}
}
