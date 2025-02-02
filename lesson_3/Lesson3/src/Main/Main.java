package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personal person10 = new Personal ("Ivanov Ivan", "Engineer", "ivanov@gmail.com", "+375297654321", 1500, 27);
		person10.fullInfo();
		Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Ivanov Ivan", "Engineer", "ivanov@gmail.com", "+375297654321", 1500, 42);
        persArray[1] = new Personal("Petrov Petr", "Doctor", "petrov@gmail.com", "+375297654322", 1700, 22);
        persArray[2] = new Personal("Bobrov Alexander", "Pilot", "bobrov@gmail.com", "+375297654323", 1800, 47);
        persArray[3] = new Personal("Smirnova Alisa", "Dantist", "smirnova@gmail.com", "+375297654324", 1550, 27);
        persArray[4] = new Personal("Titova Evgeniya", "Engineer", "titova@gmail.com", "+375297654325", 2000, 29);
        persArray[2].fullInfo();
        
		Park.Attraction park1 = new Park().new Attraction ("hellRoad", "9.00-17.00", 45);
	}

}
