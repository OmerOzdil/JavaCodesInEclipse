package day27_arrays_Part4;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {


		int [] array= {45,78,98,54,76};
		
		for(int values: array) {
			
			System.out.println(values);
		}
			
		
		System.out.println(Arrays.toString(array));
		
		
		String [][] names={
				{"Omer","Veli","Busra"},
				{"Mike","Simith","Lugano"},
				{"Vahap","Sinasi","Adil", "Kubra"}
				
		};
		for(String[] nam: names)
		
		System.out.println(Arrays.toString(nam));
		System.out.println("*********************");
		
		for( String[] group: names) {
			for (String gr: group){
				System.out.println(gr);
			}
			
			
		}

	}

}
