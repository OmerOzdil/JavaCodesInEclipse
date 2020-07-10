package day14_methods_Part2;

public class cigarParty {

	public static void main(String[] args) {
		
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
		
	}
	public static void cigarParty( int cigar, boolean weekend) {
		
		if(true) {
			if(cigar>40) {
				System.out.println("successful");
			}else {
				System.out.println("false");
			}	
		}else { 
			if(cigar>40 && cigar<60) {
			    System.out.println("Successful");
		    }else {
			   System.out.println("false");
		}
			
		}
	}

}
