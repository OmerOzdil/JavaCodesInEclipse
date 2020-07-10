package day5_unary_assignment_relational_Operators;

public class unaryOperator {

	public static void main(String[] args) {
		int i1=10;
		int i2=-100;
		int i3= -(i1+i2);
		System.out.println("i1 is "+i1);
		System.out.println("i2 is "+i2);
		System.out.println("i3 is "+i3);
		
		boolean flag=true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i=10, j=5;
		
		
		--j;
		System.out.println(j--);
		System.out.println("i is "+ i);
		System.out.println("j is "+ j);
		System.out.println(i++);
		System.out.println(++i);
		int res=i++ + --j;
		System.out.println(res);
		System.out.println(i);
		
		
		
		

	}

}
