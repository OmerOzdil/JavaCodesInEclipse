package day41_abstraction;

public abstract class Bird extends Animal {

	
	public Bird() {
		super("Ali");
	}
	
	@Override
	public void eat() {
		System.out.println("Bird is eating");
		
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void fly();
	
	

}
