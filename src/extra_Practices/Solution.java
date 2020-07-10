package extra_Practices;

import java.util.*;

public class Solution {
	

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int T=sc.nextInt();
		 sc.nextLine();
		 
		 for(int i=1; i<=T; i++) {
	     String str= sc.nextLine();
		
	        String dummy1="";
	        String dummy2="";
	        for(int j=0; j<str.length() ;j++){
	              if(j==0 || j%2==0){
	                  dummy1=dummy1+str.charAt(j);
	              }else
	              dummy2=dummy2+str.charAt(j);
	        }
	        System.out.println(dummy1+" "+ dummy2);
	      }
	}

	}


