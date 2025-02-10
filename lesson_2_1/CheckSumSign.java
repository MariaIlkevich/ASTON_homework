package lesson_2;

public class CheckSumSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkSumSign();
	}
	public static void checkSumSign () {
		int a = 2;
		int b = -2;
		int c;
		c = a + b;
		if (c >= 0) {
			System.out.println("Сумма положительная");
		}
		else {
			System.out.println("Сумма отрицательная");
		}
	}
}
