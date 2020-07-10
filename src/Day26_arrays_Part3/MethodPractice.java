package Day26_arrays_Part3;

import java.util.Arrays;

public class MethodPractice {

	public static void main(String[] args) {
		
		int position;
		int length;
		
		 String[] words={"fifteen","apple","hey","java","whatsup","$"};
		    
		    for(int i=0;i<words.length; i++){
		      
		      if((words[i].length()%2==0) || words[i].length()< 5){
		    	  
		    	  System.out.println("Invalid");
		    	 
		      }else if(words[i].length()==5){
		    	  System.out.println(words[i].substring(1,4));
		    	  
		      }else if(words[i].length()==7) {
		    	  System.out.println(words[i].substring(2,5));
		      }
		   }

	}

}
