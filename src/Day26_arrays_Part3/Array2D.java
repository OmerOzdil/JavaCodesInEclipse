package Day26_arrays_Part3;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] scores = new int[3][4];
		
		System.out.println(scores);// you get the address of the array
		
		//print first row
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);

		// print second row
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		System.out.println("---------------------");
		
		scores[0][0]= 10;
		scores[0][1]= 20;
		scores[0][2]= 30;
		scores[0][3]= 40;
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		
	}

}
