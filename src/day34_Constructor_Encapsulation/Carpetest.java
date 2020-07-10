package day34_Constructor_Encapsulation;

public class Carpetest {

	public static void main(String[] args) {
		
		
		Calculator c1 = new Calculator(new Floor(12, 10), new Carpet(8));
		System.out.println(c1.getTotal());
	

}
}
