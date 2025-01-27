package lesson_4_1;

public interface Triangle {

	static double Pi = 3.14;
	
	public static void per (double a, double b, double c) {
		double per = a+b+c;
		System.out.println("Периметр треугольника " + per);
	}
	
	public static void plo (double a, double b, double c) {
		double per = a+b+c;
		double per2 = per*(per-a)*(per-b)*(per-c);
		double plo = Math.sqrt(per2);
		System.out.println("Площадь треугольника " + a);
	}
}
