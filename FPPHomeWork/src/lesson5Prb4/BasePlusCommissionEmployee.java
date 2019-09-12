package lesson5Prb4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, SSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPaymnet() {

		return baseSalary + (getGrossSales() * getCommissionRate());
	}

	@Override
	public String toString() {
		return super.toString() +"Base Salary: " + baseSalary+"\n";
	}

}
