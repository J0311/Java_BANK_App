import java.util.Scanner;

public class Account {
	
	// Class Variables

	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

	// Here we create our Class Constructor

	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}

	// Listed Functions for Depositing Money
	// If statement for amount being equal to zero. If
	// amount equals zero, there is no action to be taken.

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	// Function for Withdrawing Money

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;

		}
	}
	// Function showing previous transaction. Here we run if/else if
	// statements while leveraging Math.abs, which simply returns the
	// ABSOLUTE VALUE of a value.

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred.");
		}
	}

	// Function calculates interest of current funds after number of years

	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance + interestRate + years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, your balance will be: " + newBalance);

	}

	// Function displaying MAIN MENU
	// Variable "option" allows us to choose from menu
	// Here is where we add Scanner object to prompt
	// user for information

	void showMenu() {
		char option = '\0';
		Scanner info = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");

		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = info.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();

			switch (option) {
			// Case 'A' allows the user to check their account balance
			case 'A':
				System.out.println("====================================");
				System.out.println("Balance = $" + balance);
				System.out.println("====================================");
				System.out.println();
				break;

			// Case 'B' allows the user to deposit money into their account. Here
			// we call our "Deposit" method.
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = info.nextInt();
				deposit(amount);
				System.out.println();
				break;

			// Case 'C' allows the user to withdraw money into their account. Here
			// we call our "Withdraw" method.
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				int amount2 = info.nextInt();
				withdraw(amount2);
				System.out.println();
				break;

			// Case 'D' allows user to view their most recent transactions.
			// Here we call the getter method as well
			case 'D':
				System.out.println("====================================");
				getPreviousTransaction();
				System.out.println("====================================");
				System.out.println();
				break;

			// Case 'E' calculates the accrued interest on the account after a number of
			// years
			case 'E':
				System.out.println("Enter how many years of accrued interest: ");
				int years = info.nextInt();
				calculateInterest(years);
				break;

			// Case 'F' exits the user from their account
			case 'F':
				System.out.println("====================================");
				break;

			// The default case let's the user know that they entered an invalid character
			default:
				System.out.println("Error: invalid option. Please enter A,B,C,D,E, or F");
				break;
			}
		} while (option != 'F');
				System.out.println("Thank you for banking with us!");

	}
}
