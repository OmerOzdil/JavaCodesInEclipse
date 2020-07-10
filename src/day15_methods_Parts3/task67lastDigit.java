package day15_methods_Parts3;

public class task67lastDigit {

	public static void main(String[] args) {
		
         boolean  x= lastDigit(27, 118);
		
		if(x){
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They dont have the same last digit");
		}
	}

	public static boolean lastDigit(int num1, int num2) {
		
		  if((num1%10)==(num2%10)) {
			  return true;
		  }else {
			  return false;
		  }
			   
		  }
		

}
