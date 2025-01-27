package Lesson_4;

public class lesson_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("Шарик");
		Cat cat1 = new Cat("Матроскин");
		Cat cat2 = new Cat("Марсик");
		Cat cat3 = new Cat("Злата");
		Cat cat4 = new Cat();
		Animal.countAnimal();
		dog1.run(189);
		dog1.run(520);
		dog1.swim(5);
		dog1.swim(11);
		cat1.run(145);
		cat2.run(220);
		cat3.swim(5);
		cat4.run(120);
		
		cat1.eat();
		cat1.bowl(12);
		cat1.bowl(15);
		cat1.eat();
		
		Animal.bigBowl(-5);
		Animal.bigBowl(50);
		
		Cat[] cats = new Cat[5];
        for (int i = 0; i < 5; i++) {
        	cats[i] = new Cat();
        	String name = (cats[i].name +" "+ i);
            System.out.println(name);
            cats[i].eatBigBowl();
            Animal.bigBowl = Animal.bigBowl - 15;
            
        }
        Animal.countAnimal();
	}

}
