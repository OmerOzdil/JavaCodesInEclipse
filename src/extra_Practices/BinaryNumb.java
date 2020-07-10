package extra_Practices;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BinaryNumb {
	private static final Scanner scanner = new Scanner(System.in);


public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    int cont=1;
    int max=1;
    int max1=1;
    String strBin=Integer.toString(n,2);
    
    System.out.println(strBin);
    
    
    for(int i=1; i<strBin.length(); i++){
    	if(strBin.charAt(i)=='0'){
    		cont=1;
    		max1=max;	
    	}else if(strBin.charAt(i-1)=='1' && strBin.charAt(i)=='1') { 
        	++cont;
        	max=cont;
    }
    }    
    System.out.println(max1);

    
    scanner.close();
}
}
