package day35_Encapsulation;

public class RoulettePocket {
	int number;
	
	public RoulettePocket(int number) {
		setNumber(number);
		
	
	}


	public int getNumber() {
		return number;
	}

	public int setNumber(int number) {
	
		if(number>=0 && number<=36) {
			return this.number=number;
		
		} else {
			return this.number=999;
		}
	}
	public String getPocketColor() {
		
		if(number==0) {
			return "Green";
		}else if(number>0 && number<10) {
			if(number%2!=0) {
				return "Red";
			}else
				return "Black";
		}else if(number>10 && number<18) {
			if(number%2!=0) {
				return "Black";
			}else
				return "Red";
		}else if(number>18 && number<28) {
			if(number%2!=0) {
				return "Red";
			}else
				return "Black";
		}else if(number>28&& number<36) {
			if(number%2!=0) {
				return "Black";
			}else
				return"Red";
		}else
			return "not eligible";	
	}
	
	}	

	
