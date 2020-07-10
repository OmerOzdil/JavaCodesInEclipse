package day14_methods_Part2;

public class primeNumber {

	public static void main(String[] args) {
		
	
	int prime= isPrime(10);
	System.out.println(prime);
	
	}
	  public static int isPrime(int i) {
		
		if(i%1==0 && i%2!=0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
			return i;
	}
	

}
