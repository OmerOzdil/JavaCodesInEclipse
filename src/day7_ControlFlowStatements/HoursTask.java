package day7_ControlFlowStatements;

public class HoursTask {

	public static void main(String[] args) {
		int hour;
		
		hour=9;
		if(hour<12) {
			System.out.println("Good Morning");
		}
if (hour>=12 && hour<15) {
	System.out.println("Good Afternoon");
}

if(hour>=15)
	System.out.println("Good Evening");
	}

}
