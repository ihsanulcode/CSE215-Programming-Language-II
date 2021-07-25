
public class LAB06_Task {

	public static void main(String[] args) {
		
		//creating an object of Account class
		Account ac = new Account(202,10000.0); //send account number and balance to the constructor 
		System.out.println(ac.toString());    //printing current info
		
		ac.debit(5000); //withdraw 5000 tk
		System.out.println("\nCurrent balance after withdraw amount: "+ac.getBalance()); //checking current balance after withdraw money
		
		ac.credit(3000); //credit 3000 tk
		System.out.println("Current balance after credited: "+ac.getBalance()); //checking current balance after credited
		
		ac.setBalance(20000.0); //update new balance
		System.out.println("Updated balance: "+ac.getBalance());
		
		//printing account information
		System.out.println("\n\nAccount information");
		System.out.println("Account number: "+ac.getAccountNumber());
		System.out.println("Account balance: "+ac.getBalance());
		
		
	}

}

class Account {
	// private data field
	private int accountNumber;
	private double balance = 0.0;

	// no argument constructor
	Account() {

	}

	// argument constructor
	Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// overloaded argument constructor
	Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// methods
	public int getAccountNumber() { // this method will return the accountNumber
		return accountNumber;
	}

	public double getBalance() { // this method will return the balance
		return balance;
	}

	public void setBalance(double balance) { // this method will update the balance
		this.balance = balance;
	}

	public void credit(double amount) { // this method will add amount to balance
		this.balance += amount;
	}

	public void debit(double amount) { // this method will help you to withdraw money
		if (balance >= amount) // checking if the balance is sufficient or not
			this.balance -= amount;
		else
			System.out.println("Amount withdrawn exceeds the current balance!");
	}

	public String toString() { // this method will return your accountNumber and balance
		return "A/C no: " + this.accountNumber + ", Balance: " + this.balance;
	}

}
