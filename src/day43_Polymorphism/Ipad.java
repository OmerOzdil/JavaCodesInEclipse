package day43_Polymorphism;

public class Ipad extends AppleDevice{

	@Override
	public void use() {
		System.out.println("Ipad | ReadBook");
		
	}
	
	public void draw() {
		System.out.println("Drawing shape using ipad");
	}

}
