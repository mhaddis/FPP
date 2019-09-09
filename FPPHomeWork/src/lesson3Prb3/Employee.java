package lesson3Prb3;

import java.time.LocalDate;
import lesson3Prb2.AccType;
import java.util.Date;
import lesson3Prb2.Account;
import java.util.GregorianCalendar;

public class Employee {

	private Account2 savingsAcct;
	private Account2 checkingAcct;
	private Account2 retirementAcct;
	private String name;
	private LocalDate hireDate;
	private boolean withdrawed = false;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = LocalDate.of(cal.YEAR, cal.MONTH, cal.DAY_OF_MONTH);

	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account2(this, "CHECKING", startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account2(this, "SAVINGS", startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account2(this, "RETIREMENT", startAmount);
	}

	public String getName() {
		return name;
	}


	public String getFormattedAcctInfo(Employee emp) {
		// implement
		
		String formatedInfo = "";
		
		if(!emp.checkingAcct.equals(null))
		{
			formatedInfo += emp.checkingAcct.toString();
		}
		if(!emp.savingsAcct.equals(null))
		{
			formatedInfo += emp.savingsAcct.toString();
		}
		if(!emp.retirementAcct.equals(null))
		{
			formatedInfo += emp.retirementAcct.toString();
		}
		
		
		return formatedInfo;
	}
	
	
	public void deposit(String acctType, double amt){
		// implement
		if(AccType.valueOf(acctType).equals(AccType.CHECKING))
		{
			checkingAcct.makeDeposit(amt);
		}
		else if (AccType.valueOf(acctType).equals(AccType.SAVINGS))
		{
			savingsAcct.makeDeposit(amt);
		}
		else if (AccType.valueOf(acctType).equals(AccType.RETIREMENT))
		{
			retirementAcct.makeDeposit(amt);
		}
		else
			System.out.println("Incorrect Account");
		
	}
	public boolean withdraw(String acctType, double amt){
		// implement
		if(AccType.valueOf(acctType).equals(AccType.CHECKING))
		{
			checkingAcct.makeWithdrawal(amt);
		}
		else if (AccType.valueOf(acctType).equals(AccType.SAVINGS))
		{
			savingsAcct.makeWithdrawal(amt);
		}
		else if (AccType.valueOf(acctType).equals(AccType.RETIREMENT))
		{
			retirementAcct.makeWithdrawal(amt);
		}
		else
			System.out.println("Incorrect Account");
		
		return withdrawed;
	}

}