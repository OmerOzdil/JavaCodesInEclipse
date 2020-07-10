package day9_ControlFlowStatements_Part3;

public class switchRules {

	public static void main(String[] args) {
		
		
		String hour;
		
		hour="5";
		
		switch(hour) {
		case "6":
			System.out.println(hour);
		break;
		case"5":
			System.out.println("right one");
		break;
		default:
			System.out.println("Not expected");
		}
		
	

	}

}
