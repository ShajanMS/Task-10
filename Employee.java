package tasK10;

import java.util.Scanner;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		this.salary += this.salary * percent / 100;
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter first name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter last name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter salary: ");
		int salary = scanner.nextInt();

		Employee emp = new Employee(id, firstName, lastName, salary);

		System.out.println(emp);

		System.out.println("Full Name: " + emp.getName());

		System.out.println("Annual Salary: " + emp.getAnnualSalary());

		System.out.print("Enter percentage to raise salary: ");
		int percent = scanner.nextInt();

		emp.raiseSalary(percent);

		System.out.println("After Raise: " + emp);

		scanner.close();

	}

}
