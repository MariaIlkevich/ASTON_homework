package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personal person10 = new Personal ();
		person10.fullInfo();
		Personal[] persArray = new Personal[5];
        for (int i = 0; i < 5; i++) {
        	String name = ("\nPerson " + i);
            System.out.println(name);
            persArray[i] = new Personal();
            persArray[i].fullInfo();
        }
        
        Park.Attraction att = new Park().new Attraction ();
        att.info();
	}

}
