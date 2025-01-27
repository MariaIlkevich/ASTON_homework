package lesson_4_1;

public interface Circle {
	static double Pi = 3.14;
	
	public static void per (double r) {
		double c = 2*Pi*r;
		System.out.println("Периметр круга " + c);
	}
	
	public static void plo (double r) {
		double a = Pi*r*r;
		System.out.println("Площадь круга " + a);
	}

}
