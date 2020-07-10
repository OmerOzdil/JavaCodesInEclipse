package day43_Polymorphism;

public class Mac extends AppleDevice{
	
	@Override
	public void use() {
		
		System.out.println("MAac| Code| Play");
	}
	
	public void code() {
		
		System.out.println("Mac is coding");
	}

}
