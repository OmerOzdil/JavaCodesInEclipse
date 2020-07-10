package day8_controlFlowStatements_Parts2;

public class Task36Calculator {

	public static void main(String[] args) {
		
		int x=5, y=6;
		
		String operator="/";
		double res=0.0;
		switch(operator) {
		case"+":
		    res= x+y;
		    break;
		case"-":
			res=x-y;
			break;
		case"*":
			res=x*y;
			break;
		case"/":
			res=x/y;
			break;	
			default:
				System.out.println("Invalid Operator");
		}
		System.out.println("result="+ res);
		

	}

}
