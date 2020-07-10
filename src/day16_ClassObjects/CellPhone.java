package day16_ClassObjects;

public class CellPhone {
	String brand;
	double secreenSize;
	String color;
	double price;

	
	public void call() {
		System.out.println(brand + " is being called");	
	}
	public void message() {
		System.out.println(brand+ " has got a message");
	}
	public void takePhoto() {
		System.out.println(brand+ " is taking a photo");	
	}

}

