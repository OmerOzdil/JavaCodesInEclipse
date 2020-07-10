package day16_ClassObjects;

public class carObjects {

	public static void main(String[] args) {


		Car car1 = new Car();
		car1.printCarInfo();
		
		car1.make="Ford";
		car1.model="Fiesta";
		car1.color="Blue";
		car1.currentSpeed=55;
		
		car1.printCarInfo();
		car1.drive();
		car1.showCurrentSpeed(40);
		car1.showCurrentSpeed(90);
		
		System.out.println("Before:"+ car1.currentSpeed);
		
		car1.accelerate(20);
		System.out.println("After:"+ car1.currentSpeed);
		
		

	}

}
