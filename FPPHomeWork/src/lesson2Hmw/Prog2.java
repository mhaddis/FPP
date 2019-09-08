package lesson2Hmw;

public class Prog2 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			float x=1.27f, y=3.881f,z=9.6f;
			int sum = (int)(x+y+z);
			System.out.println("Sum by Casting: "+sum);
			sum = (int)(Math.round(x+y+z));
			System.out.println("Sum by Rounding: "+sum);

	}

}
