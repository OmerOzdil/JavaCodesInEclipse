package day9_ControlFlowStatements_Part3;

public class test2 {

	public static void main(String[] args) {
		int year=1992;
		
		if( year%400==0&& year%100==0) {
			System.out.println(year+" is the leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		             }

	}

}
