package lesson5Prb3;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure uh = new UpwardHat();
		Figure dh = new DownwardHat();
		Figure fm = new FaceMaker();
		Figure vr = new Vertical();

		Figure[] fg = { uh, uh, dh, fm, vr };

		Arrays.toString(fg);
		for (Figure f : fg)
			f.getFigure();
		System.out.println();
		for (Figure f : fg) {
			System.out.print(f.getClass().getSimpleName() + ": \t");
			f.getFigure();
			System.out.println();
		}
	}
}