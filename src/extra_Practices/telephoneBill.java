package extra_Practices;

import java.util.Scanner;

public class telephoneBill {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of calls you have made ");
		
		int calls= sc.nextInt();
		double bill=200;
		
		
		if(calls<=100) {
			System.out.println("Your bill is "+ bill +"$");
		}else if(calls>100 && calls<150) {
			bill=bill +(calls-100)*0.60;
			System.out.println("Your bill is "+ bill +"$");	
		}else if(calls>=150 && calls<200) {
			bill= bill +50*0.6 + (calls-150)*0.5;
			System.out.println("Your bill is "+ bill +"$");
		}else if (calls>=200) {
			bill= bill+ 50*0.6 +50*0.5 +(calls-200)*0.4;
			System.out.println("Your bill is "+ bill +"$");
		}
	}
}
