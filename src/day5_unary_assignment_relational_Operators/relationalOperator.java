package day5_unary_assignment_relational_Operators;

public class relationalOperator {

	public static void main(String[] args) {
		
		byte b1=1;
		byte b2=2;
		double d1=3.5;
		int i1=17;
		float f1=67.0f;
		
		boolean test1=b1<b2;
		System.out.println(test1);
		
		boolean test2=b1>b2;
		System.out.println(test2);
		
		boolean test3=d1!=b1;
		System.out.println(test3);
		
		boolean test4=(i1*d1)>=(f1-42);
		System.out.println(test4);
		
		boolean test5=i1>d1;
		System.out.println(test5);
		boolean test6=(i1*f1)-b2 >= f1/d1;
				System.out.println(test6);
		double var=(i1*f1)-b2+f1/d1;
		System.out.println(var);
		float var1=(i1*f1);
				System.out.println(var1);
		//= assignment operator is x=3,
		//relational oerator whther cjheck is x==3; true or false
		
				int omer=5;
				omer++;
				System.out.println(omer++);
				System.out.println("The new Value of the omer is "+omer);
		
				
				int var5=50;
				int var6=100;
				boolean test15=var5<=var6;
				
				System.out.println(test15);
		
		
		
		
		

	}

}
