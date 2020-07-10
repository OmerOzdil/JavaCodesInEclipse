package day13_methods_Part1;

public class credirCardMethod {

	public static void main(String[] args) {
		
      double salary=50000;
      int  creditRating=5;
      
      if(salary>=20000 && creditRating>=7) {
    	  qualify();
      }else {
		noQualify();
		System.out.println("Please try improving your Credit Score");
      }
	}

	public static void qualify() {
	System.out.println("Congrat, You are qualified for a CC");	
		
	}
	public static void noQualify() {
		System.out.println("I am sorry you are not qualified for the credit card");
		
	}

}
