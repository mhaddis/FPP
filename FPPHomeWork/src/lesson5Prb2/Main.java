package lesson5Prb2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p0 = new Professor("Hiwot", 55000, LocalDate.of(1993, 7, 9));
		Professor p1 = new Professor("Beza", 45000, LocalDate.of(2010, 5, 16));
		Professor p2 = new Professor("Amir", 35000, LocalDate.of(1998, 4, 20));
		p0.setNumberOfPublications(50);
		p1.setNumberOfPublications(45);
		p2.setNumberOfPublications(60);

		Secretary s0 = new Secretary("Blen", 25788, LocalDate.of(2007, 7, 15));
		Secretary s1 = new Secretary("Sura", 32789, LocalDate.of(1999, 10, 25));
		s0.setOvertimeHours(55);
		s1.setOvertimeHours(87);

		DeptEmployee[] department = { p0, p1, p2, s0, s1 };

		System.out.print(
				"Do you want to see the sum of all Professors and Secretaries salary in the Department? (Y/N): ");

		Scanner sc = new Scanner(System.in);
		String answer = sc.next();

		if (answer.equalsIgnoreCase("Y")) {
			double sum = 0.0;

			for (int i = 0; i < department.length; i++) {
				sum += department[i].computeSalary();
			}
			System.out.println("Sum of all salaries is: " + sum);
		}
		sc.close();
	}

}
