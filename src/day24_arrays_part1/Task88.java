package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int price=0;
		

		String[] Cars = new String [7];
		
		Cars[0]="Honda";
		Cars[1]="Toyota";
		Cars[2]="NIssan";
		Cars[3]="BMW";
		Cars[4]="Mercedes";
		Cars[5]="Porche";
		Cars[6]="Ferrari";
		
		System.out.print("Please chose your dream car:");
		int index=sc.nextInt();
		String SelectedCar=Cars[index];
		
		if(SelectedCar.contains("Honda")|| SelectedCar.contains("Toyota") || SelectedCar.contains("Nissan")) {
			
			price=rn.nextInt((40000-20000)+1)+20000;
		}else if( SelectedCar.contains("Mercede")|| SelectedCar.contains("BMW")) {
			
			price=rn.nextInt((80000-50000)+1)+50000;
		}else if(SelectedCar.contains("Porche")|| SelectedCar.contains("Ferrari")) {
			price=rn.nextInt((150000-100000)+1)+100000;
		}
		System.out.println("price of your selected car is "+ price);
		

	}

}
