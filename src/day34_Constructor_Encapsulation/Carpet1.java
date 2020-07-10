package day34_Constructor_Encapsulation;

public class Carpet1 {

	double cost;
	
	public Carpet1( double cost) {
		if(cost<0) {
			this.cost=0;
		}else {
			this.cost=cost;
		}
	}
	public double getCost() {
		return cost;
	}
}
