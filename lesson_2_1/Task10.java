package lesson_2;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1, 1, 0};
		for (int o : num) {
			if (o == 0) {
				o = 1;
			}
			else {
				o = 0;
			}			
		System.out.println (o);
  }
}
}