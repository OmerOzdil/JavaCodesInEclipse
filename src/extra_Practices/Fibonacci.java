package extra_Practices;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();	
		System.out.println(fib(num));
	}
	public static int fib(int num) {
		int previous=0;
		int current=1;
		int next=0;
		
		for(int i=0; i<num; i++ ) {
			next=current+previous;
			previous=current;
			current=next;
		}	
		
		return next;
	}
	

}
