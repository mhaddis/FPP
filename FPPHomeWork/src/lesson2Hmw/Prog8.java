package lesson2Hmw;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 2, -8, 0, 58, 765, 55 };
		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min)
				min = n[i];
		}

		System.out.println("The mininum Number is" + min);
	}

}
