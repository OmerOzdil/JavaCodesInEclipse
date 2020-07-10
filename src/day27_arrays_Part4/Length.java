package day27_arrays_Part4;

public class Length {

	public static void main(String[] args) {

		int [][] numbers=
			{
					{1,2,3},                  // row0
					{2,3,5,7,89},             // row1
					{98,89,78,76,45,98,9},    //row2
					{45,54,78,98}            // row3  
					
			};
		
		System.out.println("Number of the rows: "+ numbers.length);
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("The number of coloums in row "+ i+" is "+ numbers[i].length );
		}
		
		for(int i=0; i<numbers.length; i++) {
			for( int j=0; j<numbers[i].length; j++) {
				
				System.out.println(numbers[i][j]);
					
				}
			}
		}
		

	}


