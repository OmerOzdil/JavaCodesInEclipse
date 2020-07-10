package day27_arrays_Part4;

public class Question3 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y = {7,3};
		
		int[] x1 = {1,2,3};
		int[] y1 = {7,3,2};
		
		int[] x2 = {1,2,3};
		int[] y2 = {1,3};
		
		int[] x3 = {1};
		int[] y3 = {7,3};
		
		int[] x4 = {1,2,3};
		int[] y4 = {1};
		System.out.println(sameElement(x,y));
		System.out.println(sameElement(x1,y1));
		System.out.println(sameElement(x2,y2));
		System.out.println(sameElement(x3,y3));
		System.out.println(sameElement(x4,y4));
		
			

	}
	public static String sameElement(int[] x,int[] y){
		
		if(!(x.length>1)) {
			return "Array1 is not valid";
		}if(!(y.length>1)) {
			return "Array2 is not valid";
		}
		
		if(x[0]==y[0] || x[x.length-1]==y[y.length-1]) {
			return"True";
		}else {
			return "False";
		}
		
	}

}
