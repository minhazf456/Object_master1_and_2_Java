package com.codingdojo.java.objectmaster1;


public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human();
		Human human2 = new Human();
		human2.attack(human);
		human.displayHealth();
	}

}
