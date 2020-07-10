package day9_ControlFlowStatements_Part3;

public class orLogicWithSwitch {

	public static void main(String[] args) {
		char grade='A';
		
		switch(grade) {
		
		case'A': case'B': case'C':
			System.out.println("Pass");
		break;
		case'D':case'E':
			System.out.println("Fail");	
		break;
		default:		
		}
		

	}

}
