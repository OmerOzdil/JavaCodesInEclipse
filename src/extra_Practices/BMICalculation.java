package extra_Practices;

import java.util.Scanner;

public class BMICalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your weight in pound: ");
		
		double mass= sc.nextDouble();
		System.out.print("Please enter your height in inches: ");
		
		double height=sc.nextDouble();
		
		mass=mass*0.454;
	    height=height*0.0254;
		
		
		double BMI= mass/(height*height);
		
		if(BMI<18.5) {
			System.out.println("Your BMI is "+ BMI);
			System.out.println("Your risk factory is Underweight");
			
		}else if(BMI>=18.5 && BMI<25) {
			System.out.println("Your BMI is "+ BMI);
			System.out.println("Your risk factory is Normal weight");
		}else if(BMI>=25 && BMI<30) {
			System.out.println("Your BMI is "+ BMI);
			System.out.println("Your risk factory is Overweight");
			
		}else if(BMI>=30) {
			System.out.println("Your BMI is "+ BMI);
			System.out.println("Your risk factory is Obesee");
			
		}else
			System.out.println("Your BMI is not applicable");	
	}

}
