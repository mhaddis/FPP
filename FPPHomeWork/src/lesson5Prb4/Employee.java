package lesson5Prb4;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employee(String firstName, String lastName, String SSN)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		socialSecurityNumber = SSN;
	}
	
	public abstract double getPaymnet();
	
	@Override
	public String toString() {
		return "First Name: "+firstName+ "	Last Name: "+lastName+"		SSN: "+ socialSecurityNumber+"\n";
	}
}