package lesson_4_1;

public class Circles extends Figure implements Circle {
	public Circles(double r) {
		Circle.per(r);
		Circle.plo(r);
		this.fon = "red";
		this.gran = "red";
		System.out.println("Цвет заливки " + fon + ", цвет граниыц " + gran);		
	}

}
