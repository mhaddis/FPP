package lesson3Prb4;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter C for Circle\n"+ "Please Enter R for Rectangle\n"+ "Please Enter T for Triangle\n");
		String choice= sc.nextLine();
		
	
	switch(choice){
	
	case"T":
	
	System.out.println("Please Enter the base of the Triangle");
	double base= sc.nextDouble();
	System.out.println("Please Enter the height of the Triangle");
	double height= sc.nextDouble();
	Triangle areaT= new Triangle(base, height);
	System.out.println("The area of Triangle is : "+areaT.computeArea());
	break;

	case "C":
	
	System.out.println ("Please Enter the Radius of the Circle");
	double radius=sc.nextDouble();
	Circle areaC=new Circle(radius);
	System.out.println ("The Area of the Circle is :"+ areaC.computeArea());
	break;
	
	case "R":
		
	System.out.println("Please Enter the Length of the Rectangle");
	double length= sc.nextDouble();
	System.out.println("Please Enter the Width of the Rectangle");
	double width= sc.nextDouble();
	Rectangle areaR= new Rectangle(width, length);
	System.out.println("The area of the rectangle is :"+areaR.computeArea());
	break;
	
	default: 
		
	System.out.println("Wrong letter");
		
		}
	
	sc.close();
	}
	
}