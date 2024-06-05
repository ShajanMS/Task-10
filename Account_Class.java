package tasK10;

import java.util.Scanner;

public class Account_Class {
	private double balance;

	public Account_Class() {

	}

	public Account_Class(double initialBalance) {

	}

	public void Account() {
		this.balance = 0.0;
	}

	public void Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
			System.out.println("New Balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
			System.out.println("New Balance: " + balance);
		} else {
			System.out.println("Invalid withdraw amount or insufficient balance");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Account_Class account1 = new Account_Class();
		System.out.println("Account 1 (default balance):");
		System.out.println("Balance: " + account1.getBalance());

		System.out.print("Enter initial balance for Account 2: ");
		double initialBalance = scanner.nextDouble();

		Account_Class account2 = new Account_Class(initialBalance);
		System.out.println("Account 2:" );
		System.out.println("Balance: " + account2.getBalance());

		System.out.print("Enter amount to deposit in Account 2: ");
		double depositAmount = scanner.nextDouble();
		account2.deposit(depositAmount);

		System.out.print("Enter amount to withdraw from Account 2: ");
		double withdrawAmount = scanner.nextDouble();
		account2.withdraw(withdrawAmount);

		scanner.close();

	}

}
