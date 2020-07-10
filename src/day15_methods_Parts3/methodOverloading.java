package day15_methods_Parts3;

public class methodOverloading {

	public static void main(String[] args) {
		

	
		System.out.println(sum(3,5,10));
	int x=sum(70, 80, 90,100);
	System.out.println(x);
	sum();
	}
	public static void sum() {
		System.out.println("Hello");
	}
	
	public static int sum(int a, int b) {
		return a+b;
		
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	public static int sum(int a, int b, int c, int d) {
		
		return a+b+c+d;
	}

}
