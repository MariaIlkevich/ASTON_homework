package Main;

public class Personal {
	private String fullName;
	private String position;
	private String email;
	private String phone;
	private int salary;
	private int age;
	
	public Personal (String fullName,String position, String email, String phone, int salary, int age) {
		this.fullName = "Ivan Ivanov";
		this.position = "Engineer";
		this.email = "ivivan@gmail.com";
		this.phone = "80297654321";
		this.salary = 1500;
		this.age = 27;
				}
	public Personal () {
		this.fullName = "Ivan Ivanov";
		this.position = "Engineer";
		this.email = "ivivan@gmail.com";
		this.phone = "80297654321";
		this.salary = 1500;
		this.age = 27;
				}
	public void fullInfo () {
		System.out.println("\nФИО: " + fullName + "\nДолжность: " + position + "\nEmail: " + email +"\nТелефон: " + phone + "\nЗарплата: " + salary + "\nВозраст: " + age);	
		}
}