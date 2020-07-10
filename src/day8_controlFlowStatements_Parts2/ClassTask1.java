package day8_controlFlowStatements_Parts2;

public class ClassTask1 {

	public static void main(String[] args) {
		int a, b, c;
		a=400;
		b=500;
		c=300;
		if(a>b && a>c ) {
			System.out.println(" a is the grater one");
		}else if(b>a && b>c) {
			System.out.println(" b is the greatest");
		}else if(c>a && c>b) {
			System.out.println(" c is the greatest");
		}else {
			System.out.println("all equal");
		}
			
	}

}
