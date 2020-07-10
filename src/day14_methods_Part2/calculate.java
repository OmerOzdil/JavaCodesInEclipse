package day14_methods_Part2;

public class calculate {

	public static void main(String[] args) {
		

		calculateGrade(9, 80, 70);
		
	}
	
	public static void calculateGrade(int x, int y, int z) {
		
	 double sum=(x+y+z)/3;
	 
	     if(sum>=90 && sum<=100) {
	    	 System.out.println("grade is A");
	     }else if(sum>=80 && sum<=89) {
	    	 System.out.println("grade is B");
	     }else if(sum>=70 && sum<=79) {
	    	 System.out.println("grade is C");
	     }else if(sum>=60 && sum<=69) {
	    	 System.out.println("grade is D");
	     }else {
	    	 System.out.println("grade is F");
	     }
		
		
	}

}
