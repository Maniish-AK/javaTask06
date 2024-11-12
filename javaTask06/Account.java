package javaTask06;

public class Account {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public Account() {
		this.accountNumber = "0000000000";
		this.accountHolderName = "ABC";
		this.balance = 0.0;
	}

	public Account(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Amount to deposit should be positive!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw: " + amount);
		} else if (amount > balance) {
			System.out.println("Insufficient balance!");
		} else {
			System.out.println("Amount to withdraw should be positive!");
		}
	}

	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public static void main(String[] args) {

		Account myObj1 = new Account();
		System.out.println("Account 1 details:");
		myObj1.checkBalance();

		myObj1.deposit(500.0);
		myObj1.checkBalance();
		myObj1.withdraw(200.0);
		myObj1.checkBalance();
		myObj1.withdraw(400.0);


		Account myObj2 = new Account("1234567890", "John Doe");
		System.out.println("\nAccount 2 details:");
		myObj2.checkBalance();


		myObj2.deposit(1000.0);
		myObj2.checkBalance();
		myObj2.withdraw(150.0);
		myObj2.checkBalance();
	}

}
