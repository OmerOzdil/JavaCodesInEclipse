package day4_arithmeticOperator;


//this progrsm calculate the hourly wages
public class Wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double regularWage;
		double basePay=25;
		double regularHours=40;
		double overtimeWages;
		double overTimePay=37.5;
		double overTimeHours=10;
        double totalWage;
        regularWage=basePay*regularHours;
        overtimeWages=overTimePay*overTimeHours;
        totalWage=overtimeWages+regularWage;
        System.out.println("Wage for this are $ " + totalWage);
	}

}
