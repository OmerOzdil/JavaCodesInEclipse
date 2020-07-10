package Day26_arrays_Part3;


import java.util.Scanner;

public class Method_Arrays2 {

	public static void main(String[] args) {
		

  System.out.println(findCar(3, "Honda"));
	
	
		
		
	}
	public static String[] createArray(int carsize) {
		
		String[] MyArray= new String[carsize];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the name of car:  ");
		
		for(int i=0; i<MyArray.length; i++) {
			
			MyArray[i]=sc.nextLine();	
			
		}	
		return MyArray;
		
	}
	public static boolean findCar(int x, String y) {
		
    //String[] array= createArray(x);
   // 
    //for(int i=0; i<array.length; i++) {
    	
    //	if(array[i].equalsIgnoreCase(y)) {
    //		return true;
    //	}
    //}
    //return false;
		
		for( String car: createArray(x)) {
			
			if(car.equalsIgnoreCase(y)) {
				return true;
			}
		}
		return false;
	}
	
	
}
