package lesson3Prb3;

import lesson3Prb2.AccType;
public class Account2 {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccType acctType;
	private Employee employee;

	Account2(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = AccType.valueOf(acctType);
		this.balance = balance;
	}

	Account2(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	@Override 
	public String toString() {
		return "Account type:" + acctType.toString() + "\n Current bal: " + balance + "\n";
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

