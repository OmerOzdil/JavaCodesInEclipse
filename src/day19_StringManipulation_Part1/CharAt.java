package day19_StringManipulation_Part1;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {


		String word="Computer";
		
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		
		//Please first character is A
		String word2="Apple";
		
		if(word2.charAt(2)=='A') {
			System.out.println("First character is A");
		}else {
			System.out.println("Not an A");
		}
		
		//check 
		String word3="civic";
		
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("Are the same");
		}else {
			System.out.println("They are not the same");
		}
		
		//last index not hard coded.
		
		String word4="Omer";
		
		char lastchart=word4.charAt((word4.length()-1));
		
		System.out.println(lastchart);
		
		
		
		
		
		

	}

}
