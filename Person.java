package tasK10;

import java.util.Scanner;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");

		String name = scanner.nextLine();

		System.out.print("Enter age: ");

		int age = scanner.nextInt();

		Person person = new Person(name, age);

		System.out.println("Name: " + person.getName());

		System.out.println("Age: " + person.getAge());

		scanner.close();

	}

}
