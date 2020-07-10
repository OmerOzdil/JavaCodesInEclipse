package day27_arrays_Part4;

public class Question1 {

	public static void main(String[] args) {
		
		int [] array= {2,5,6,6};
		int [] array1 = {6,1,2,3};
		int [] array2 = {13,6,1,2,3};
		
		System.out.println(check6(array));
		System.out.println(check6(array1));
		System.out.println(check6(array2));

	}
	public static boolean check6(int[] value) {
		
		if(value.length>=1) {
			if(value[0]==6 || value[value.length-1]==6) {
				return true;
				
			}else
				return false;
			
		}else
		return false;
	}
		
	

}
