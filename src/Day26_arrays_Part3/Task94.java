package Day26_arrays_Part3;

import java.util.Arrays;

public class Task94 {

	public static void main(String[] args) {
		String info1="This info is used for creation password : xxxCD132Gxxx. Please do not share with anyone";
		String info2="This info is used for creation password : xxx00ABC!xxx. Please do not share with anyone.";
		
		String[]  array1=info1.split("password :");
		String[]  array2= info2.split("password :");
		
		System.out.println(Arrays.toString(array1));
		String[] pass1=array1[1].split(" Please");
		String pass2=array2[1].split(" Please")[0];
		System.out.println(pass2);
		
		pass1[0]=pass1[0].substring(4,10);
		pass2=pass2.substring(4,10);
		System.out.println(pass1[0].trim()+ pass2.trim());
		
		
		
		
		
		
		
		
	}

}
