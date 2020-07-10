package day15_methods_Parts3;

public class assignemet1_SwapValues {

	public static void main(String[] args) {
		
		// solution-1 by using  3rd variable
		int n1=10;
		int n2=20;
		int n3=0;
		
		n3=n1;
		
		n1=n2;
		n2=n3;
		
		
		
		System.out.println("n1= "+n1);
		System.out.println("n2= "+n2);
		
    //solution-2 without using 3rd variable;
		
		int num1=10;
		int num2=20;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("n1= "+ n1);
		System.out.println("n2= "+n2);
		
		
	}

}
