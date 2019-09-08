package lesson3Prb2;

public class Account {
	

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccType acctType;
	private Employee employee;

	Account(Employee employee2, String acctType, double balance) {
		employee = employee2;
		this.acctType = AccType.valueOf(acctType);
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	@Override 
	public String toString() {
		return "type = " + acctType.toString() + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		boolean withdraw = false;
		
		if(balance > amount)
		{
			balance -= amount;
			withdraw = true;
		}
		else
			withdraw = false;
		
		return withdraw;
	}
	
	public double getBalance() {
		return balance;
	}

	public AccType getAcctType() {
		return acctType;
	}
}

