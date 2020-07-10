package day14_methods_Part2;

public class Lab5Ticket {

	public static void main(String[] args) {
		CaughtSpeed(60, false);
		CaughtSpeed(65, false);
		CaughtSpeed(65, true);

	}

	  public static void CaughtSpeed(int speed, boolean birthday) {
		  
		  if(birthday) {
			  if(65>=speed) {
				  System.out.println("No ticket");
			  }else if(speed>66 && speed<=85) {
				  System.out.println("result is 1");
			  }else {
				  System.out.println("result is 2");
			  }
		  }else {
			  if (60>=speed) {
				  System.out.println("NO ticket");
			  }else if(speed>61 && speed<=80) {
				  System.out.println("result is 1");
			  }else {
				  System.out.println("result is 2");
			  }
			  
		  }
	  }
}
