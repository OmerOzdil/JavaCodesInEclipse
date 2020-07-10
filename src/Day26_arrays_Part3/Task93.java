package Day26_arrays_Part3;

import java.util.Arrays;

public class Task93 {

	public static void main(String[] args) {
		
		int counter= 0;
		String str="Talented Physics teacher passionate about making the "
				+ "secondary school experience a positive one for all students."
				+ " Works to improve school climate so that all students can learn course materials, "
				+ "as well as the social skills they need to thrive in all aspects of their lives."
				+ " I am also compassionate who presents course materials in a clear, interesting and"
				+ " innovative way. ";
		
		String[] array= str.split(" ");
		System.out.println(Arrays.toString(array));
		
		System.out.println(array.length);
		
		for(int i=0; i<array.length; i++) {
			
			counter+=1;
		}
		System.out.println(counter);
		
		System.out.println(array[0]);
		System.out.println(array[59]);

	}

}
