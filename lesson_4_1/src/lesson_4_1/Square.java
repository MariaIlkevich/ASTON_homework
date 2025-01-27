package lesson_4_1;

public interface Square {
	public static void per (double a, double b) {
		double c = a+a+b+b;
		System.out.println("Периметр прямоугольника " + c);
	}
	
	public static void plo (double a, double b) {
		double plo = a*b;
		System.out.println("Площадь прямоугольника " + a);
	}
}
