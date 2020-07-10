package day15_methods_Parts3;

public class calcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		
		
		calcFeetAndInchesToCenctimeters(156);
		calcFeetAndInchesToCentimeters(60, 15);
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet>=0 && (inches>=0 && inches<=12)) {
			
             double cm=(feet*30.48 +inches*2.54);
             System.out.println(feet +" feet, "+ inches+ "inches= "+ cm+ "centimeters");
			
			return cm;
		}
			
			return -1;
		
	}
	public static double calcFeetAndInchesToCenctimeters(double inches) {
		
		if (inches<0) {
			return -1;
			
		}else {
		
			double feet=(int)inches/12;
			double remainingInches=inches%12;
			
			System.out.println(inches+ " inches="+ feet +" feet and "+ remainingInches+ "inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
	}

}
