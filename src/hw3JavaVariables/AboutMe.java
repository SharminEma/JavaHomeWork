package hw3JavaVariables;

public class AboutMe {
	public int myBirthYear; // variable declared

	// all the variable below are initialized
	public String myName = "Jebun Nahar Sharmin";
	public int mYRollNumber = 11;
	public char myClassSection = 'A';
	public boolean married = true;
	public byte numbOfChild = 2;
	public short numbOfBooks = 32000;
	public long myScore = 84513245641l;
	public float valueOfPie = 3.1416f;
	public double my_GPA = 3.124565689786758578;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // aboutMe is instantiated
		System.out.println("My name is: " + aboutMe.myName + "\n\n\tSection of my class is: " + aboutMe.myClassSection
				+ "\n\tMy GPA: " + aboutMe.my_GPA);

	}

}
