package day33_ClassessObject_Constructors;

public class Mouse {

	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	public Mouse(int weight) {
		this(weight,16);
		System.out.println("Do u like Java");
	}
	public Mouse(int weight, int numTeeth) {
		this(weight,numTeeth,6);
		System.out.println("Hello, who am I");
		
	}
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("I love constructr");

	}
	public void print() {
		System.out.println(weight + " "+  numTeeth+ " "+ numWhiskers);
	}
	
	
}
