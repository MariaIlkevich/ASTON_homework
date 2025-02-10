package lesson_2;

public class Task9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(task9(2004));
		}
	public static boolean task9 (int year){
		if (year % 400 == 0) {
			return true;
		}
		else if (year % 100 == 0) {
			return false;
		}
		else if (year % 4 == 0) {
			return true;
		}
		else {return false;}
	}

}