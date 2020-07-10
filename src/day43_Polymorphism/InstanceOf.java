package day43_Polymorphism;

public class InstanceOf {

	public static void main(String[] args) {
	
		
		
		
		shape shape = new shape();
	
		shape = new triangle();
		shape = new Circle();
		
		
		if( shape instanceof Circle) {
			System.out.println("Circle");
		}else if( shape instanceof triangle) {
			System.out.println("triangle");	
		}else if(shape instanceof Square) {
			System.out.println("Square");
		}

	}

}
