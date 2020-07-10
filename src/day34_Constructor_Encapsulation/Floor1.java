package day34_Constructor_Encapsulation;

public class Floor1 {

	
	double length;
	double width;
	
	public Floor1(double width, double length) {
		if(width<0) {
			this.width=0;
		}else {
			this.width=width;
		}
		if(length<0) {
			this.length=0;
		}else {
			this.length=length;
		}
	}
	public double getArea() {
		return length*width;
	}
}
