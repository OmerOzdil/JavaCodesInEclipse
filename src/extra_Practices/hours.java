package extra_Practices;

import java.util.Scanner;

public class hours {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter the seconds: ");
		
		int seconds= sc.nextInt();
		
		secondConverter(seconds);
	}
	public static void secondConverter(int x) {
		
		
		
		if(x>=60 && x<3600) {
			System.out.println("There are "+ (x/60)+ " minutes in the "+ x + "seconds");
		} else if(x>=3600 && x<86400) {
			System.out.println("There are "+ (x/3600)+ " hours in the " + x + "seconds");
		}else if(x>86400) {
			System.out.println("There are "+ (x/86400)+ " days in the x"+ "seconds");	
		}else if(x<60) {
			System.out.println("there are no minutes in this seconds.");
		}else
			System.out.println("In valid second");
			
	}

}
