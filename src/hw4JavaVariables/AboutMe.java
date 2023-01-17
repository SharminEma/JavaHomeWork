package hw4JavaVariables;


public class AboutMe {
	//variable is declared
	public String name;
	public int age;
	public char sex;
	public boolean married;
	public short myApartmentNumber;
	public long myBankAccountNumber;
	public float myGpa;
	public double myWeight;
	
	public AboutMe() {
		System.out.println("This is all about us" ); //constructor is declared
		
	}
	
	//method is declared
	public void aboutMe() {
		System.out.println("My name is :" + name);
		System.out.print("My age :" + age +"\nMy Sex :" + sex);
		System.out.println(" \nMy marital status :" + married);
		System.out.println("My apartment number :" + myApartmentNumber);
		System.out.println("My bank account number :" + myBankAccountNumber);
		System.out.print("My weight :" + myWeight + "\nMy GPA :" + myGpa);
		
	}

	
}

