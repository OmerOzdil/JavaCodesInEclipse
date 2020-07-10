package day8_controlFlowStatements_Parts2;

public class switchCase {

	public static void main(String[] args) {
		String weather="Wind";
		
		switch(weather) {
		
		case"Sunny":
			System.out.println("Go to park");
			System.out.println("Code to Java");
			break;
		case "hot":
			System.out.println("Go to Swimming");
			System.out.println("Code to Java");
			break;
		
		case"Windy":
			System.out.println("Fly to Kite");
			System.out.println("Code to java");
			break;
		case"Snow":
			System.out.println("Go snowboarding");
			System.out.println("Code to Java");
			break;
		default:
			System.out.println("Code to java any other weather");
		
		}
			
		

	}

}
