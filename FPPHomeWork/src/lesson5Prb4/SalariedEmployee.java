package lesson5Prb4;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
		super(firstName, lastName, SSN);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPaymnet() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString() +"Weekly Salary: " + weeklySalary+"\n";
	}

}
