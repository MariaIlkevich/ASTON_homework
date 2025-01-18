package core;

public abstract class Main {
    public static void main(String[] args) {
        //Задание Л5
        Person person1 = new Person("Роман", "Инженер", "roman1@mail.ru", "+375297777777", 1500, 18);
        Person person2 = new Person("Роман", "Сантехник", "roman1@mail.ru", "+375297777777", 1500, 18);
//        person1.fullInfo();
//        person2.fullInfo();


        Person [] persArray = new Person[5];
        persArray[0] = new Person("Роман", "Инженер", "roman1@mail.ru", "+375297777777", 1500, 18);
        persArray[1] = new Person("Роман", "Сантехник", "roman1@mail.ru", "+375297777777", 1500, 18);
        persArray[2] = new Person("Роман", "Инженер", "roman1@mail.ru", "+375297777777", 1500, 18);
        persArray[3] = new Person("Роман", "Инженер", "roman1@mail.ru", "+375297777777", 1500, 18);
        persArray[4] = new Person("Роман", "Инженер", "roman1@mail.ru", "+375297777777", 1500, 18);

        for (Person person : persArray) { // новое написание приравнено к перебору всех подряд элементов массива
            person.fullInfo();
        }

        Park.ParkNew att = new Park().new ParkNew("колобок", "18.00", 15);

//  printThreeWords();
//        checkSumSign ();
//              task8("textPrint", 5);
//      System.out.println(task9(2024));
//        task10();

    }
//    public static void printThreeWords(){
//        System.out.println("Orange");
//        System.out.println("Banana");
//        System.out.println("Apple");
//    }

//   void checkSumSign() {
//        int a = 12;
//        int b = 10;
//        int c=a-b;
//
//        if (c <= 0) {
//            System.out.println("Отрицательная");
//
//        }else {
//            System.out.println("Положительная");
//        }
//
//    }

//   public static void task3(){
//        int value = 5;
//        if (value <= 0){
//            System.out.println("Красный");
//        }
//        else if (value >0 && value<100){
//            System.out.println("Желтый");
//        }
//        else {
//            System.out.println("Зеленый");
//        }
//    }

//    public static void task8(String text, int count){
//
//        for (int i = 0; i < count; i++) {
//            System.out.println(text);
//        }
//
//    }

//    public static boolean task9(int a) {
//        if (a % 4 == 0) {
//            return true;
//        } else if (a % 100 == 0) {
//            return false;
//        } else if (a % 400 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void task10() {
//        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //создаем массив
//        for (int i = 0; i < array.length; i++) {  //циклы хорошо подходят для массива, чтобы перебрать все значения внутри массива
//            //  array[i] = i; // чтобы проинициализировать каждый элемент массива
//            if (array[i]== 1) {
//                System.out.println(0);
//            } else if (array[i] == 0) {
//                System.out.println(1);
//            } else {
//                System.out.println("Неверное значение");
//            }
//        }
//
//    }


}

