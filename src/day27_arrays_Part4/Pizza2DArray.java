
package day27_arrays_Part4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {
		
		String [] str= {"omer","ali", "Veli","Ayse"};
		
		for(String str1: str) {
			System.out.println(str1);
		}
		System.out.println(Arrays.toString(str));

   String [][] pizzas= {
		   
		   {"pinepalle","pepperoni"},
		   {"anchovies", "mushroom", "olives"},
		   {"4 chees"},
		   {"chicken","tomates","onions"},
		   {"green papper","zuccini","brocolo", "spincah","shrimp"}
		   
   };
   
   System.out.println(Arrays.toString(pizzas[0]));
   System.out.println(Arrays.toString(pizzas[1]));
   
   //(for each Loop
   
   for(String[] pizza: pizzas) {
	   System.out.print(pizza.length +"-");
	   System.out.println(Arrays.toString(pizza));
	   
   }

   //For Iterator Loop
   
   for(int row=0; row<pizzas.length; row++) {
	   for(int coloum=0; coloum<pizzas[row].length; coloum++) {
		   System.out.println(pizzas[row][coloum]);
	   }
   }
   
   for(String value: pizzas[3]) {
	   System.out.println(value);
   }
   
   
   int[][] students= {{4,5,6},{12,5,6},{23,78,98}};
   
   for( int[] group: students) {
	   for(int studentID: group) {
		   System.out.println(studentID);
	   }
	   
	   int [] [] numbers= {{1,2,3,76},{98,78,65,45},{45,76,2},{90,87}};
	  
	  for(int[] nums: numbers) {
		  System.out.println(nums.length+"-");
		  System.out.println(Arrays.toString(nums));
		  
	  }
	   
   }
	}

}
