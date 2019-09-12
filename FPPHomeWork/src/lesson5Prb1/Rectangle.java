package lesson5Prb1;

public class Rectangle extends Shape{
	
double width;
double height;

public Rectangle (String color, double width, double height) {
	super(color);
	this.height=height;
	this.width=width;

	}

@Override
public double calcualteArea() {
 return width*height;
}

@Override
public double calculatePerimeter() {
	 return (2 * width + 2 * height);
	}
}


