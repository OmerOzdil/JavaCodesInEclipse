package day8_controlFlowStatements_Parts2;

public class exercise {

	public static void main(String[] args) {
		
		
		double a, b;
		a=30;
		b=7;
		
		String Operator;
		
		Operator="/";
		double res= a+b;
		
		switch(Operator) {
		
		case"*":
			res=a*b;
			break;
		case"-":
		res=a-b;
		break;
		case"/":
			res=a/b;
			break;
		case"+":
			res=a+b;
			break;
			default:
				System.out.println("Invalid Operator");
			
		}
System.out.println("result="+res);
	}

}
