package lesson_2;

public class TrueOrFalseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (trueOrFalseMethod(-2));
		}
		
	public static String trueOrFalseMethod (int value) {
		String bool;
		if (value < 0) {
			bool = "true";
		}
		else {
			bool = "false";
	    }
		return bool;
			
		}

	}