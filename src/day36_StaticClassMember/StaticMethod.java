package day36_StaticClassMember;

public class StaticMethod {
	
	String name;

	public static void show1() {
		
		System.out.println("Hi");
		//show2(); //u can not call instance method/variable from method
		show4(); // u can call static method from static method
		//System.out.println(name);
	}
	public void show2() {
		System.out.println("Hi");
		show1();// you call static from instance method.
		System.out.println(name);
		show1(); //you can call static from instance
	}
	public void show3() {
		System.out.println("Hi");
		show2(); //you call instance method from instance method.
	}
	public static void show4() {
		System.out.println("Hi");
	}
}
