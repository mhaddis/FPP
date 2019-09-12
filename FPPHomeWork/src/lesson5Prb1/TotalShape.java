package lesson5Prb1;

public class TotalShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = { new Rectangle("Blue", 4, 6), new Square("Black", 4), new Circle("Grey", 5),
				new Square("Green", 3.5), new Circle("Red", 6.4) };
		printTotal(shapes);
	}

	public static void printTotal(Shape[] shapes) {

		double totalArea = 0;
		double totalPerimeter = 0;

		for (int i = 0; i < shapes.length; i++) {

			totalArea += shapes[i].calcualteArea();
			totalPerimeter += shapes[i].calculatePerimeter();
		}

		System.out.println("The total Area for the 5 shapes is: " + totalArea);
		System.out.println("The total Perimeter for the 5 shapes is: " + totalPerimeter);
	}

}
