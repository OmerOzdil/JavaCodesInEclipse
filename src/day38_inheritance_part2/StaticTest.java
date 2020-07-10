package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {


		Staticsub obj= new Staticsub();
		obj.num= 5;
		obj.print();
		
		staticSuper.num=10;
		staticSuper.num1=11;
		obj.print();
		System.out.println(Staticsub.num);
		
		//Staticsub.m2();
		
		obj.m2(); // must call only by objcet name bacuse it is not static.
		obj.num1(); // call both class name or objcet name
		//staticSuper.m2();

	}

}
