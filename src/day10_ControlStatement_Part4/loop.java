package day10_ControlStatement_Part4;

public class loop {

	public static void main(String[] args) {
	
		for(int i=1; i<5; i*=2) {
			System.out.println("i is "+ i);
		}
 String year;
 year="200";
 switch(year) {
 case"100":
	 System.out.println("wrong");
	 break;
 case"200":
	 System.out.println("right");
	 break;
	 default:
		 System.out.println("none is correct");
	 
 }
 
	}

}
