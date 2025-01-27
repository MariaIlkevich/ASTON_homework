package Lesson_4;

public class Dog  extends Animal{

	String name;
	static int countDog = 0;
	
	public Dog(String name) {
		this.name = name;
		countDog++;
		// TODO Auto-generated constructor stub
	}

	public void run (int x) {
		if (x>0 && x<=500) {
		System.out.println(name + " пробежал " + x + " м.");
	}
		else {System.out.println(name + " столько не пробежит.");}
	}
	public void swim (int x) {
		if (x>0 && x<=10) {
		System.out.println(name + " проплыл " + x + " м.");
	}
		else {System.out.println(name + " не проплывет столько.");}
	}

}
