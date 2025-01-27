package lesson_4_1;

public class Squares extends Figure implements Square{

	public Squares(double a, double b) {
		Square.per(a, b);
		Square.plo(a, b);
		this.fon = "green";
		this.gran = "green";
		System.out.println("Цвет заливки " + fon + ", цвет граниыц " + gran);
	}
}
