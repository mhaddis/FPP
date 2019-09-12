package lesson5Prb4;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate) {
		super(firstName, lastName, SSN);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	public double getPaymnet() {
		return getGrossSales() * getCommissionRate();
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String toString() {
		return super.toString() + "Gross Sales: " + grossSales + "	Commission Rate: " + commissionRate + "\n";
	}
}