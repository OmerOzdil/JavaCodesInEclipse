package extra_Practices;

import java.util.*;

public class Star {

	public static void main(String[] args) {
		
		String result="8,641 results for xbox";
		String[] each=result.split(" ");
		for(String arr:each) {
			System.out.println(arr);
		}
		System.out.println(Integer.parseInt(result.split(" ")[0].replaceAll(",", ""))+1);
	
		
		}
////		int num=Integer.parseInt(result.split(" ")[0]);
////		
////		System.out.println(num);
////		
////					int i = 1;
////					int j = 1;
////					Scanner scan = new Scanner(System.in);
////					int n = scan.nextInt();
////			     
////			     for(int k=0;k<n;k++){
////			       for(int a=0;a<=k;a++){
////			         System.out.print("*");
////			       }
////			       System.out.println("");
////			     }
//			  }
//
//	

}
