package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public long IMEINumber;
	public char grade;
	public boolean madeInUsa;

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.\n");
	}

	public Computer(String Brand, String Model, String Operatingsystem) {

		this.brand = Brand;
		this.model = Model;
		this.operatingSystem = Operatingsystem;
		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem);
	}

	public Computer(int Price) {
		this.price = Price;
		System.out.println("Price: $" + price);
	}

	public Computer(char Grade) {
		this.grade = Grade;
		System.out.println("Grade: " + grade);
	}

	public Computer(boolean MadeInUsa) {
		this.madeInUsa = MadeInUsa;
		System.out.println("Made in the USA: " + madeInUsa);

	}

	public Computer(long IMEI) {
		this.IMEINumber = IMEI;
		System.out.println("IMEI Number :" + IMEI);
	}

}
