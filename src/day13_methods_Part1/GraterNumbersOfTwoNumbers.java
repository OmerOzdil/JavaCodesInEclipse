package day13_methods_Part1;

public class GraterNumbersOfTwoNumbers {

	public static void main(String[] args) {
		
      GreaterNUmbers();
	}
	public static void GreaterNUmbers() {
		int a=80;
		int b=80;
		if(a>b) {
			System.out.println(a+ " is greater than "+ b);
		}else if (b>a) {
			System.out.println(b+ " is greater than "+ a);
		}else {
			System.out.println("Numbers are equal");
		}
	}

}
