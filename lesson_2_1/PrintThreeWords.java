package lesson_2;

public class PrintThreeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("task1");
		task1 ();
		System.out.println();System.out.println("task2");
		task2 ();
		System.out.println();System.out.println("task3");
		task3 ();
		System.out.println();System.out.println("task4");
		task4 ();
		System.out.println();System.out.println("task5");
		System.out.println (task5(2,14));
		System.out.println();System.out.println("task6");
		task6 (-1);
		System.out.println();System.out.println("task7");
		System.out.println (task7(-2));
		System.out.println();System.out.println("task8");
		task8("Маша",3);
		System.out.println();System.out.println("task9");
		System.out.println(task9(2004));
		System.out.println();System.out.println("task10");
		task10 ();
		System.out.println();System.out.println("task11");
		task11 ();
		System.out.println();System.out.println();System.out.println("task12");
		task12 ();
		System.out.println();System.out.println();System.out.println("task13");
		task13 ();
		System.out.println();System.out.println("task14");
		task14 (5, 4);

	}
	
	public static void task1 () {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
		}
	//----------------------------------------
	public static void task2 () {
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
	//------------------------------------------
	public static void task3 () {
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
	//--------------------------------------------
	public static void task4 () {
		int a = 0;
		int b = 2;
		if (a >= b) {
			System.out.println("a>=b");
		}
		else {
			System.out.println("a<b");
	    }
	}
	//--------------------------------------------
	public static String task5 (int value1, int value2) {
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
	//---------------------------------------------
	public static void task6 (int a) {
		
		if (a > 0) {
			System.out.println("положительное число");
		}
		else {
			System.out.println("отрицательное число");
	    }
	}
	//------------------------------------------------
	public static String task7 (int value) {
		String bool;
		if (value < 0) {
			bool = "true";
		}
		else {
			bool = "false";
	    }
		return bool;
			
		}
	//------------------------------------------------
	public static void task8 (String s, int a) {
		for (int i=0; i < a; i++) {
		System.out.println(s);
	   }
	}
	//-----------------------------------------------
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
	//--------------------------------------------------
	public static void task10 (){
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
	//-------------------------------------------------
	public static void task11 (){
int [] num = new int [100];
	int i = 0;
	for (int o : num) {
	    i++;
	    o = i;
		System.out.print (o + " ");
		}
	}
	//--------------------------------------------------
	public static void task12 () {
		int [] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
	for (int o : num) {
		if (o < 6) {
			o = o*2;
		}			
	System.out.print (o + " ");
		}
	}
	//-------------------------------------------------
	public static void task13 () {
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
	//--------------------------------------------------
	public static void task14 (int len, int initialValue) {
	int [] num = new int [len];
	for (int o : num) {
		o = initialValue;
		System.out.print(o + " ");
	}
	}
}