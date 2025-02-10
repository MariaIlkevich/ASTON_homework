
public class lesson_12_junit_5 {

	public static int getFactorial(int f) {
		int result = 1;
		if (f == 1 || f == 0) {
			return result = 1;
		} else if (f < 0) {
			System.out.println("Введите положительное число");
			return result = 0;
		} else {
			for (int i = 1; i <= f; i++) {
				result = result * i;
			}
			return result;
		}
	}
}
