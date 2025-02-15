package lesson_5;

public class Array {

	public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
		// TODO Auto-generated method stub
		String[][] a = { { "0", "1", "2", "3" }, { "1", "2", "3", "4" }, { "2", "3", "4", "5" },
				{ "3", "4", "5", "6" } };
		array(a);

	}

	public static void array(String arr[][]) throws MyArraySizeException, MyArrayDataException {
		int rows = arr.length;
		int cols = arr[0].length;
		int summa = 0;
		if (rows != 4 || cols != 4)
			throw new MyArraySizeException("Неверный размер массива");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				try {
					summa += Integer.parseInt(arr[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException("Неверный формат ячейки [" + i + "][" + j + "] " + arr[i][j]);
				}

			}
		}
	}
}
