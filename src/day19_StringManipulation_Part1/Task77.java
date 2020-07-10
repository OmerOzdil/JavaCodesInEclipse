package day19_StringManipulation_Part1;

public class Task77 {

	public static void main(String[] args) {

     String emoji=";7";
     
     char first=emoji.charAt(0);
	 char second=emoji.charAt(1);
     
     if(emoji.length()==2) {
    	 
    	 		 if(first==':') {
    			   if(second==')') {
    				 System.out.println("Smile");
    			 }else if(second=='(') {
    				 System.out.println("Sad");
    			 }else if(second=='p') {
    				 System.out.println("Playful");		 
    			 }else if(second=='/'){
    				 System.out.println("Joyful");
    			 }else 
    			 {
    				 System.out.println("Unknown Emoji");
    			 }
    			 
    		 	 }if (first==';') {
    		 		 if(second==')') {
    		 			 System.out.println("Wink");
    		 		 }else if(second=='0') {
    		 			 System.out.println("Suprised");
    		 		 }else {
    		 			 System.out.println("Unknown Emoji");
    		 		 }
    		 	 }
    	 
     }else {
    	 System.out.println("Invalid Emoji");
     }
		

	}

}
