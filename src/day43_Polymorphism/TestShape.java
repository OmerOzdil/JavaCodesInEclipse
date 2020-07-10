package day43_Polymorphism;

public class TestShape {

	public static void main(String[] args) {


		shape shape1 = new shape();
		
		shape shape2 = new Circle();
		shape2.draw();
		
		shape shape3 = new shape();
		shape3.draw();
		
		shape shape4 = new triangle();
		shape4.draw();
		shape4.ali("Omr");
		

	}

}
