package tasK10;

import java.util.Scanner;

public class Teaclass {
	private boolean hasMilk;
	private boolean hasSugar;

	public void Tea() {
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
}

class GreenTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing green tea with hot water and green tea leaves.");
	}

	@Override
	public void displayTea() {
		System.out.println("Green tea prepared.");
	}
}

class HerbalTea extends Tea {
	@Override
	public void prepareTea() {
		System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
	}

	@Override
	public void displayTea() {
		System.out.println("Herbal tea prepared.");
	}

	public class TeaTest {

		@SuppressWarnings("resource")
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			Tea[] teas = new Tea[3];
			teas[0] = new Tea();
			teas[1] = new GreenTea();
			teas[2] = new HerbalTea();

			
			System.out.println("Choose the type of tea to prepare:");
			System.out.println("1. Basic Tea");
			System.out.println("2. Green Tea");
			System.out.println("3. Herbal Tea");
			int choice = scanner.nextInt();

			if (choice < 1 || choice > 3) {
				System.out.println("Invalid choice.");
				return;
			}

			
			Tea selectedTea = teas[choice - 1];
			selectedTea.prepareTea();

			
			System.out.print("Add milk? (yes/no): ");
			String addMilk = scanner.next();
			if (addMilk.equalsIgnoreCase("yes")) {
				selectedTea.addMilk();
			}

			
			System.out.print("Add sugar? (yes/no): ");
			String addSugar = scanner.next();
			if (addSugar.equalsIgnoreCase("yes")) {
				selectedTea.addSugar();
			}

			
			selectedTea.displayTea();

			scanner.close();

		}
	}
}
