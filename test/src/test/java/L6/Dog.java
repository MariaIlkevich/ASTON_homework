package L6;

class Dog extends Animal{
    String name;
    static int countDog = 0;
public Dog(){
    countDog++;
}
public Dog(String name){
    this.name=name;
    countDog++;
}
public void runDog(int x) {
    if (x <= 500) {
        System.out.println(name + " пробежал " + x + " м.");
    } else if (x > 500) {
        System.out.println(name + " не бегает столько");
    } else {
        System.out.println("Ошибка значения");
    }
}
public void swimDog(int x){
    if (x<=10){
        System.out.println(name+" проплыл "+x+" м.");
    }
    else if (x>10) {
        System.out.println(name+" сдох!");
    }
    else {
        System.out.println("Ошибка значения");
    }
}
}