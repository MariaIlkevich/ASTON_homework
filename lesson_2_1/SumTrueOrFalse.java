package lesson_2;

public class SumTrueOrFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (sumTrueOrFalse(2,14));
	}
	
	public static String sumTrueOrFalse (int value1, int value2) {
		int sum;
		String bool;
		sum= value1 + value2;
		if (sum < 20 && sum > 10) {
			bool = "true";
		}
		else {
			bool = "false";
	    }
		return bool;
		
	}

}