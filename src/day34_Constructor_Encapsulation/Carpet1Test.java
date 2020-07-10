package day34_Constructor_Encapsulation;

public class Carpet1Test {

	public static void main(String[] args) {

		Calculator1 c1 = new Calculator1(new Floor1(12,10.6), new Carpet1(8));
		System.out.println(c1.getTotalCost());
		

		Floor1 f2= new Floor1(78, 78);
		Carpet1 cp2 = new Carpet1(35);
		Calculator1 c2 = new Calculator1(f2, cp2);
		System.out.println(c2.getTotalCost());
		
		
		

	}

}
