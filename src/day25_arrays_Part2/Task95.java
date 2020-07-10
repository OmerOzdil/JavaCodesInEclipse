package day25_arrays_Part2;

public class Task95 {

	public static void main(String[] args) {
		
		
		int [][] scores= {
				
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
				};
		
		
		System.out.println(scores[1][2]);
		int sum=0;
		for (int coloum=0;coloum<scores[0].length; coloum++)
			sum=sum+ scores[0][coloum];
		
		
			
		{
			System.out.println(sum/scores[0].length);
			
			int sum2=0;
			for(int row=0 ; row<scores.length; row++) {
				
			sum2= sum2+ scores[row][0];	
			}
			System.out.println(sum2);
			
		}
		
	}

}
