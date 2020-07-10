package day34_Constructor_Encapsulation;

public class Calculator1 {

	Floor1 floor1;
	Carpet1 carpet1;
	
	public Calculator1(Floor1 floor1, Carpet1 carpet1) {
		
		this.floor1=floor1;
		this.carpet1=carpet1;
	}
	public double getTotalCost() {
	return	floor1.getArea()*carpet1.getCost();
	}
}
