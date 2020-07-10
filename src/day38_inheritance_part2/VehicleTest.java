package day38_inheritance_part2;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.display();	

	}

}
class Vehicle {
	
	int maxSpeed=120;
	
}
class Car extends Vehicle
{
	int maxSpeed=180;
	
	void display() {
		System.out.println("Maximum speed: "+super.maxSpeed);
		System.out.println("Maximum speed:"+ maxSpeed);
	}
}