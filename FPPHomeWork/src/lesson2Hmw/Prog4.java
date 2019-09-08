package lesson2Hmw;

import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please type your String:");
		String str = input.nextLine();
		String reversed = "";
		for(int i=str.length()-1; i>=0;i--){
			reversed += str.charAt(i);
		}
		System.out.println("The reversed String is: " + reversed);
		input.close();
	}

}
