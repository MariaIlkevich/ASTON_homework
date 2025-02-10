package lesson_2;

public class PrintColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printColor();
	}
	
	public static void printColor () {
		int value = 10;
		if (value <= 0) {
			System.out.println("Красный");
		}
		else if (value > 1 && value < 100) {
			System.out.println("Желтый");
		}
		else {
			System.out.println("Зеленый");
	    }
	}

}
