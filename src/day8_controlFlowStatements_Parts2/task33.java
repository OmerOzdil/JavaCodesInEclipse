package day8_controlFlowStatements_Parts2;

public class task33 {

	public static void main(String[] args) {
		int a=101;
		
		if(a<60) {
			System.out.println("Fail");
		}else if(a>=60 && a<90) {
			System.out.println("Pass");
		}else if(a>=0 && a<=100) {
			System.out.println("Passed with Distinction");
		}else if(a>100) {
			System.out.println("Impossible");
		}
    }

}
