package L6;

class Cat extends Animal {
    String name;
    static int countCat = 0;
    public Cat(){
        countCat++;
    }
    public Cat(String name) {
        this.name = name;
        countCat++;
    }

    public void runCat(int x) {
        if (x <= 200) {
            System.out.println(name+" пробежал "+x+" м.");
        } else if (x > 200) {
            System.out.println(name+"не бегает столько");
        } else {
            System.out.println("Ошибка значения");
        }

    }
    public void swimCat(int x) {
        System.out.println(name+ " не умеет плавать");
    }

//        public void catInfo() {
//            System.out.println("Кот " + name + " " + swim + " и " + run);
//        }
}