package extra_Practices;

import java.util.Scanner;

public class sign {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number");
		int num= sc.nextInt();
		
		
		System.out.println(sign(num));

	}
	public static int sign(int x) {
			
		if(x<0) {
			return -1;		
		}else if (x==0){
			return 0;
		}else
			return 1;
			
	}

}
