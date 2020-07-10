package extra_Practices;

import java.util.*;


public class cities {

	public static void main(String[] args) {
		int day=1;
		  Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    
		    
		    for(int k=0; k<inhabitants.length;k++) {
		    System.out.print("Please enter " +k+ " Value of the Array:");
		    	inhabitants[k]=input.nextInt();
		    }
		    System.out.println("Day 0 "+Arrays.toString(inhabitants));
		   
		    for(int j=0; j<inhabitants.length;j++){	
		      int var=inhabitants[j];
		      
		      if(inhabitants[j]>0){
		         for(int i=0; i<inhabitants.length;i++){
		        inhabitants[i]=inhabitants[i]/2;
		    } 
		    
		      System.out.println("Day "+day+ " "+Arrays.toString(inhabitants));
		      day++;
		      }
		      
		    }

	}

}
