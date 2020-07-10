package day15_methods_Parts3;

public class task69PrimeNumber {

	public static void main(String[] args) {
		
		int number= 16;
		
    if(isPrime(number)) {
    	System.out.println("prime number");
    	
    }else {
    	System.out.println("not a prime number");
    }
    	
    }
	
	public static boolean isPrime(int number) {
		
		boolean flag=true;
		if(number==0 || number==1) {
			 
			flag=false;
			
		}else {
			
			for(int i=2; i<number-i; i++) {
				if(number%i==0) {
				 flag= false;
					
					break;
				}
				
			}
		}
	
		return flag;
	}

}
