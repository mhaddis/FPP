package lesson5Prb4;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours) {
		super(firstName, lastName, SSN);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPaymnet() {

		return wage * hours;
	}

	@Override
	public String toString() {
		return super.toString() +"Wage: " + wage + "		Hours: " + hours+"\n";
	}

}
