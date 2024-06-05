package tasK10;

import java.util.Scanner;

public class Tea {

	private boolean hasMilk;
	private boolean hasSugar;

	public Tea() {
		this.hasMilk = false;
		this.hasSugar = false;
	}

	public void prepareTea() {
		System.out.println("Preparing basic tea with hot water and tea leaves.");
	}

	public void addMilk() {
		this.hasMilk = true;
		System.out.println("Milk added to the tea.");
	}

	public void addSugar() {
		this.hasSugar = true;
		System.out.println("Sugar added to the tea.");
	}

	public void displayTea() {
		String teaDescription = "Basic tea with hot water and tea leaves";
		if (hasMilk) {
			teaDescription += ", milk";
		}
		if (hasSugar) {
			teaDescription += ", and sugar";
		}
		System.out.println(teaDescription + ".");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Tea myTea = new Tea();

		myTea.prepareTea();

		myTea.addMilk();

		myTea.addSugar();

		myTea.displayTea();

		scanner.close();

	}

}
