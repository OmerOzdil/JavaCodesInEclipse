package day14_methods_Part2;

public class task66 {

	public static void main(String[] args) {
		
      distanceTravelled(70, 2.5);
      
      double dis= distanceTravelled(70,2.5);
      System.out.println(dis+"m");
		
		
	}
	public static double distanceTravelled(double speed, double time) {
		
		double distance=speed*time;
		
		return distance;
		
		
	}

}
