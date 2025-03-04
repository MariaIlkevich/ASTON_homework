package L6;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Cat cat2 = new Cat("Марс");
        cat2.runCat(20);
        cat2.swimCat(25);
        Dog dog1 = new Dog("Бобик");
        dog1.runDog(200);
        dog1.swimDog(10);
        Animal.countAnimal();
    }
}