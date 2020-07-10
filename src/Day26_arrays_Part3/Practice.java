package Day26_arrays_Part3;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class Practice {

	public static void main(String[] args) {
		 
		
		String[] words= {"aaaa", "bbbbbbb", "jjjaaavvvaaaaaaa","dsj","sdjfjdbasdbbsddbhdbsdbh","iouhteo"};
		
		int[] numbers= {17,5,6,7,10,7675,90};
		System.out.println(numbers[0]);
		Arrays.sort(numbers);;
		System.out.println(numbers[0]);
		Arrays.sort(words);
		System.out.println(words[1]);
		System.out.println(largest(words));
		
		Arrays.sort(words);
		System.out.println(words[0]);
					
		}
		
		public static String largest(String[] arr) {
			int max = arr[0].length();
			
			String dummy="";
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i].length()>max) {
					max = arr[i].length();
					
					dummy=arr[i];
				}
			}
			
			System.out.println(max);
			return dummy;
				
	}
		

}
