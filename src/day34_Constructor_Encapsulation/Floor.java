package day34_Constructor_Encapsulation;

public class Floor {
	
	double length;
	double width;
	
	
	public Floor(double length, double width) {	
		
		if(width<0) {
			this.width=0;
		}else {
			this.width=width;
		}
		if(length<0) {
			length=0;
		}else {
			this.length=length;
		}
				
	}
	public double getArea() {
		
		return length*width;
			
	}

}


