package lesson5Prb4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum=0;
		
		Employee[] emp= {
				new CommissionEmployee("Hiwot", "Bishaw", "N001", 40, 10),
				new HourlyEmployee("Bezawit", "Demisse", "N002", 50, 15),
				new SalariedEmployee("Meron", "Haddis", "N003", 100),
				new BasePlusCommissionEmployee("Blen", "Mekuria", "N004", 55, 40, 30),
				new HourlyEmployee("Amir", "Abdulmalik", "N005", 60, 20)
				};
	for (Employee em: emp) {
		sum+=em.getPaymnet();
	System.out.println(em);
	}
	System.out.println("Total salaries of all the employees is: "+sum);
	}
	
}