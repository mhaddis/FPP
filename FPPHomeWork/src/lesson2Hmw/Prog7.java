package lesson2Hmw;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i = 0; i < args.length; i++) {  
			System.out.println("Length of \"" + args[i] + "\" is : " + args[i].length());
			if(args[i].startsWith("A")) count++;
			}
		System.out.println(count + " strings start wirh \"A\"");
	}
}
