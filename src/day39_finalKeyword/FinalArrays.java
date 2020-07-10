package day39_finalKeyword;

public class FinalArrays {

	public static void main(String[] args) {

     final int [] TEAMS= {11,11}; // no problem whether there is final or not yo can modify it.
      System.out.println(TEAMS[0]);
      System.out.println(TEAMS[1]);
      
      TEAMS[0]=10;
      TEAMS[1]=9;
      
      System.out.println(TEAMS[0]);
      System.out.println(TEAMS[1]);
      
      int[] nums= {13,55,3535};
      nums = new int[] {13,55,3535,42};
      
      final int[] finalNums = {23,66,44,12};
      finalNums[0]=120;
      
      //finalNUMS = new int[] {1,2,3,4};
      
      

	}

}
