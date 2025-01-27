package Lesson_4;

public class Cat extends Animal{

	static int countCat = 0;
	static int satiety = 15;
	static boolean catSatiety = false; 
	static int bowl = 0;
	String name;
	
	public Cat(String name) {
		this.name = name;
		countCat++;
	}
	
	public Cat() {
		this.name = "Котяра";
		countCat++;
	}
	
	
	public void run (int x) {
		if (x>0 && x<=200) {
		System.out.println(name + " пробежал " + x + " м.");
	}
		else {System.out.println(name + " устанет, будут болеть лапки от этого расстояния");}
	}
	public void swim (int x) {
		System.out.println(name + " боится мочить лапки)");
	}

	public static void bowl(int feed) {
		if (feed<0) {
			System.out.println("Не воруй еду у котика!!!");
		} else {
			bowl = feed;
		}
	}
	
	public static void eat() {
		if (bowl<satiety) {
			System.out.print("Не дразни котика!!!");
			System.out.println("Котик сыт:" + catSatiety);
		} else {
			catSatiety = true;
			System.out.println("Котик сыт:" + catSatiety);
			
		}}
		
		public static void eatBigBowl() {
			catSatiety = false;
			if (bigBowl<satiety) {
				System.out.print("Не дразни котика!!!");
				System.out.println("Котик сыт:" + catSatiety);
			} else {
				catSatiety = true;
				System.out.println("Котик сыт:" + catSatiety);
				
			}
	}
	
}
