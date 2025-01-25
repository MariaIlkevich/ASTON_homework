package Main;

public class Park {

	public Park() {
		
	}
	public class Attraction{
		private String name;
		private String time;
		private int price;
		
		public Attraction (String name, String time, int price) {
			this.name  = "hellRoad";
			this.time = "8.00 - 18.00";
			this.price = 35;
		}
		public Attraction () {
			this.name  = "Hell Road";
			this.time = "8.00 - 18.00";
			this.price = 35;
		}
		
		public void info () {
			System.out.println ("\nАттракион: " + name + "\nВремя работы: " + time + "\nЦена: " + price);
		}
	}
}
