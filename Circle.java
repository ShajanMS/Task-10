package tasK10;

import java.util.Scanner;

public class Circle {

	private double radius;

	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Circle circle1 = new Circle();

		System.out.println("Circle 1 (default radius):");

		System.out.println("Radius: " + circle1.getRadius());

		System.out.println("Circumference: " + circle1.calculateCircumference());

		System.out.print("Enter the radius for Circle 2: ");

		double radius = scanner.nextDouble();

		Circle circle2 = new Circle(radius);

		System.out.println("Circle 2:" + radius);

		System.out.println("Radius: " + circle2.getRadius());

		System.out.println("Circumference: " + circle2.calculateCircumference());

		scanner.close();

	}

}
