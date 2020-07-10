package day33_ClassessObject_Constructors;

public class Rectangle {
	
	double length;
	double width;
	
	
	//Default Constructor.
	
	public Rectangle() {
		System.out.println("Default constructor");
	} 
	
	/// creating a constructor - I want to initiliase my obect variables thru constructor.
	public Rectangle(double l, double w) {
		
		 length = l;
		  width = w;
			
	}
	
	public void getArea() {
		
		System.out.println(length*width);
	}

}
