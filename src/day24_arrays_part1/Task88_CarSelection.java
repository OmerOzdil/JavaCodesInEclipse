package day24_arrays_part1;

import java.util.*;

public class Task88_CarSelection {

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
		
		switch(SelectedCar) {
		
		case "Honda" : case "Toyota": case"Nissan" :
			price=rn.nextInt((40000-20000)+1)+20000;
			break;
		case "BMW": case"Mercedes":
			price=rn.nextInt((80000-50000)+1)+50000;
			break;
		case"Porche": case"Ferrari":
			price=rn.nextInt((150000-100000)+1)+100000;
			break;
		default:
		}
		
		System.out.println("Price for selected car is "+ price );

	}
	
		
	

}
