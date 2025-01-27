package Lesson_4;

public class Animal {

		static int bigBowl=0;
		
		public static void bigBowl(int feed) {
			if (feed<0) {
				System.out.println("Не воруй еду у котиков!!!");
			} else {
				bigBowl = feed;
				System.out.println("Еды в миске для котиков " + bigBowl);
			}}
	
	public static void countAnimal () {
		int countDog = Dog.countDog;
		int countCat = Cat.countCat;
		int countAllAnimal = countDog + countCat;
		System.out.println("Всего животных: " + countAllAnimal + ". Собак: " + countDog + ". Котов: " + countCat + ".");
	}
	public void run (int x) {
		System.out.println("Зверь пробежал " + x + " м.");
	}

	public void swim (int x) {
		System.out.println("Зверь проплыл " + x + " м.");
	}
	
}
