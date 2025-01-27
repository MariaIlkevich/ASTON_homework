package lesson_4_1;

public class Triangles extends Figure implements Triangle{

	public Triangles(double a, double b, double c) {
		Triangle.per(a,b,c);
		Triangle.plo(a, b, c);
		this.fon = "blue";
		this.gran = "blue";
		System.out.println("Цвет заливки " + fon + ", цвет граниыц " + gran);
		
	}
}
