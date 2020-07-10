package extra_Practices;

public class midNumber {

	public static void main(String[] args) {

		int num1=85;
		int num2=80;
		int num3=90;
		
if((num1>num2 && num1<num3) || (num1>num3 &&  num1<num2)) {
	
	    System.out.println("Num1 is the mid number "+ num1);
    }else if((num2>num1 && num2<num3)|| (num2>num3 && num2<num1)) {
		System.out.println("Num2 is the mid number "+ num2);
	}else
		System.out.println("Num3 is the mid number "+ num3);
	
	
	
	

}

}
