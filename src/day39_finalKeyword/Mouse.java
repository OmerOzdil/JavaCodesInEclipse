package day39_finalKeyword;

public class Mouse extends Rodent {

	protected int tailLength = 8;
	
	public void getMouseDetils() {
		
		System.out.println("tail:"+ tailLength+ ", parentTail: "+super.tailLength);
	}
}
