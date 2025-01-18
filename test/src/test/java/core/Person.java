package core;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    // Создаём конструктор (объект, исполняется много раз, но для разных объектов)

    public Person (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void fullInfo() {
        System.out.println("\nФИО: " + name + "\nДолжность: " + position + "\nEmail: " + email + "\nТелефон: "
                + phone + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }

////    public void setName(String name) {
////        this.name = name;
////    }
//    public String getName() {
//        return name;
//    }
////    public void setPosition(String position) {
////        this.position = position;
////    }
//    public String getPosition() {
//        return position;
//    }
////    public void setEmail(String email) {
////        this.email = email;
////    }
//    public String getEmail(){
//        return email;
//    }
////    public void setPhone(String phone) {
////        this.phone = phone;
////    }
//    public String getPhone(){
//        return phone;
//    }
////    public void setSalary(int salary) {
////        this.salary = salary;
////    }
//    public int getSalary(){
//        return salary;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
}
