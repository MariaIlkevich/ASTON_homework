package L6;

public class Animal {
    static void run(){
        System.out.println("умеет бегать");
    }

    String swim = "умеет плавать";

    public Animal(){
    }
    public static void countAnimal() {
        int countCat = Cat.countCat;
        int countDog = Dog.countDog;
        int countAllAnimal = countCat + countDog;
        System.out.println("Всего животных: " + countAllAnimal + ". Собак: " + countDog + ". Котов: " + countCat + ".");
    }

}
