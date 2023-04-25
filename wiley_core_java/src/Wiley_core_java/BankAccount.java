package Wiley_core_java;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds.");
		}
	}

}
