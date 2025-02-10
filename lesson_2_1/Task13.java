package lesson_2;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] num = new int [10] [10];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i == j) {
				num[i] [j] = 1;
				}
				System.out.print(num[i] [j]);
			}
			System.out.println();

		}

	}

}