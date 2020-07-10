package day5_unary_assignment_relational_Operators;

public class task20Ibcrement {

	public static void main(String[] args) {
		int a=1;
		int result;
		result= -a--+a++/-a--*--a;
		System.out.println(result);
		System.out.println(a);
		
		int x=4;
		
		int y=x*4 - x++;
		System.out.println("y is " + y );
		System.out.println("x is " + x );
		

	}

}
