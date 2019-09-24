package lesson12Hmw;

public class CustomerAccount {
	private String cus_name;
	private int acc_No;
	private double balance;

	CustomerAccount(String cusname, int accno, double balance) {
		this.cus_name = cusname;
		this.acc_No = accno;
		this.balance = balance;
	}

	public void deposit(double dp) {
		this.balance = this.balance + dp;
	}

	public void withdraw(double draw) throws USDException {
		if (draw > this.balance)
			throw new USDException("Withdrawl amount exceeds balance");
		if (this.balance - draw < 100)
			throw new USDException();
		this.balance = this.balance - draw;
	}

	public static void main(String[] args) throws USDException {
		CustomerAccount cus = new CustomerAccount("Epho", 12654, 100);
		cus.deposit(500);
		cus.withdraw(550);

	}
}

class USDException extends Exception {
	USDException() {

		System.out.println("Withdrawl amount exceeds balance");
	}

	USDException(String draw) {
		super(draw);
		System.out.println("Withdrawl amount exceeds balance");
	}
}
