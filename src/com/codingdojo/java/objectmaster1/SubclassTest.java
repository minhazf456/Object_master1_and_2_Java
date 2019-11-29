package com.codingdojo.java.objectmaster1;

public class SubclassTest {

	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		Wizard wizard1 = new Wizard();
		Wizard wizard2 = new Wizard();
		
		wizard1.fireball(samurai2);
		ninja.steal(wizard1).runAway();
		samurai1.dealthBlow(wizard2);
		wizard1.heal(wizard1);
		ninja.steal(samurai1);
		wizard1.fireball(samurai1).fireball(samurai1);
		samurai1.meditate();
		
		samurai2.howMany();
		
		ninja.displayHealth();
		samurai1.displayHealth();
		samurai2.displayHealth();
		wizard1.displayHealth();
		wizard2.displayHealth();
	}

}