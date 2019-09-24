package lesson12Hmw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		System.out.println("Your mark is: " + Mark.getMark());
	}

	public static int getMark() {
		int m;
		while (true) {
			System.out.println("Please Enter your mark: ");
			Scanner input = new Scanner(System.in);
			try {
				m = input.nextInt();
				if (m > 0 && m <= 100)
					return m;
				else
					throw new InputMismatchException();
			} catch (InputMismatchException e) {
				System.err.println(e);
				System.out.println(" Your input is invalid entry \n please try only 0-100 digits ");
			}
		}
	}
}