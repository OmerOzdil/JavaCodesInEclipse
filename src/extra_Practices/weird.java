package extra_Practices;

import java.util.Scanner;

public class weird {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		if(N>=1 && N<=100){
		    if(N%2!=0){
		        System.out.println("Wierd");
		    }else if(N%2==0 && N>=2 && N<=5){
		        System.out.println("Not Wierd");  
		    }else if(N%2==0 && N>=6 && N<=20){
		        System.out.println("Wierd");
		    }else if(N%2==0 && N>20){
		        System.out.println("Not Wierd");
		    } 
		    }

	}

}
