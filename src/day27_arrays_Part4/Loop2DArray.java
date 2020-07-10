package day27_arrays_Part4;

public class Loop2DArray {

	public static void main(String[] args) {
		
		int[][] numbers= { {1,2,3}, {4,5}, {7,8,9}};
		
		for(int row=0; row<numbers.length; row++) {
			for(int coloum=0;coloum<numbers[row].length; coloum++) {
				
				System.out.println(numbers[row][coloum]);
				if(coloum==(numbers[row].length-1)) {
					System.out.println("-----------------");
				}
			}
		}

	}

}
