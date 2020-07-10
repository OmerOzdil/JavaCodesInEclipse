package day33_ClassessObject_Constructors;

public class CarTest {

	public static void main(String[] args) {
		 
         /*
			Car c1 = new Car();
			
			c1.color="white";
			c1.make="honda";
			c1.year=2010;
			c1.mile=20000;
		
	    */		
		
		Car c1 = new Car("Civic", "Honda", 2000, 15000, "White");
		
		Car c2 = new Car("Q7", "Audi", 2010, 5000, "Red");
			

	}

}
