package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe Sharmin = new AboutMe(); // class instantiated and constructor initiated
		// variable is initialized
		Sharmin.name = "Sharmin Ema";
		Sharmin.age = 50;
		Sharmin.sex = 'F';
		Sharmin.married = true;
		Sharmin.myApartmentNumber = 120;
		Sharmin.myBankAccountNumber = 102120102l;
		Sharmin.myGpa = 3.18f;
		Sharmin.myWeight = 159.8;

		Sharmin.aboutMe(); // method is initialized

		System.out.println("\n--------------------------------------------------------------------");

		AboutMe Alex = new AboutMe();
		Alex.name = "John Alex";
		Alex.age = 77;
		Alex.sex = 'M';
		Alex.married = true;
		Alex.myApartmentNumber = 220;
		Alex.myBankAccountNumber = 1021562402l;
		Alex.myGpa = 2.8f;
		Alex.myWeight = 111.8;

		Alex.aboutMe();

		
	}

}
