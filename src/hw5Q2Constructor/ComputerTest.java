package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Computer();
		Computer computer01 = new Computer("Apple", "MacBook Air", "MacOS Mojave");
		Computer computer2 = new Computer(800);
		Computer computer3 = new Computer('A');
		Computer computer4 = new Computer(false);

		System.out.println("\n-------------------------------------------------------------\n");
		System.out.println("Configuration of my phone: \n");
		Computer computer5 = new Computer("Apple", "Iphone 12 PRO Max", "iOS version 16.2");
		Computer computer6 = new Computer(999);
		Computer computer7 = new Computer('A');
		Computer computer8 = new Computer(false);
		Computer computer9 = new Computer(2485178459896154l);
	}
}
