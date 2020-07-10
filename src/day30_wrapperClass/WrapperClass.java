package day30_wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int n1=10;
	Integer n2 = new Integer(10);
	System.out.println(n2);
	
		double d1= 44.5;
		Double d2 = new Double("44.5");
		
		System.out.println(d2);
		System.out.println(d1);
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)100);
		System.out.println(b1);
		System.out.println(b2);
		
		
		Integer num1 = Integer.valueOf(1234);
		System.out.println(num1);
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("False");
		System.out.println(bool1);
		System.out.println(bool2);
		
	

	}

}
