package lesson5Prb1;

public class Circle extends Shape{

	double radius;
	
public Circle (String color, double radius) {
	
	super(color);
	this.radius=radius;

}

@Override
public double calcualteArea() {
    return (Math.PI * radius * radius);
	    }

@Override
public double calculatePerimeter() {
	return (2 * Math.PI * radius* radius);
		}
}

