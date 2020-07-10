package day24_arrays_part1;

public class ArrayCreation {

	public static void main(String[] args) {
	
		int[] numbers;
		
		numbers = new int[5];
		
		int[] number= new int[9];
		
		float[] temp = new float[100];
		char[]  letters = new char[76];
		long[] units = new long[54];
		String[] words = new String[20];
		
		
		System.out.println(number[2]); // default value is 0
		
		System.out.println(words[4]);  // default value is null
		
		System.out.println(units[53]);
		
		number[3]=20;
		System.out.println(number[3]);
		
		
		int[] scores = new int[5];
		
		scores[0]=50;
		scores[1]=69;
		scores[2]=567;
		scores[3]=545;
		scores[4]=32;
		
		
		int avgScores=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
		System.out.println(avgScores);
		
		
		}

	}


