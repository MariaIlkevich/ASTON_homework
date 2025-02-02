package Main;

public class Personal {
	private String fullName;
	private String position;
	private String email;
	private String phone;
	private int salary;
	private int age;

	public Personal(String fullName, String position, String email, String phone, int salary, int age) {
		this.fullName = fullName;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}

	public void fullInfo() {
		System.out.println("\nФИО: " + fullName + "\nДолжность: " + position + "\nEmail: " + email + "\nТелефон: "
				+ phone + "\nЗарплата: " + salary + "\nВозраст: " + age);
	}
}