package extra_Practices;

import java.util.Scanner;

public class isError {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String str=sc.nextLine();
		
		System.out.println(isError(str));

	}
	public static boolean isError(String str) {
		
		String[] arr=str.split(" ");
		String word=arr[0];
		
		if(word.equalsIgnoreCase("error")) {
			return true;
		}else
			return false;
		
	}

}
