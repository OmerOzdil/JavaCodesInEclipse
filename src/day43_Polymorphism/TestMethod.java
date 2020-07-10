package day43_Polymorphism;

public class TestMethod {

	public static void main(String[] args) {
		
	
		childA chA = new childA();// no polymorphism.
		chA.m1();
		chA.m2();
		chA.m3();
		
		childB chB = new childB();
		
		chB.m1();
		chB.m2();
		chB.m4();
		
		Parent p1= new childA();          // can only reach overridden methods access them -- > if-no or methods in the parent.
		p1.m1();
		
		Parent p2 = new childB();         // can only reach overridden methods access them -- > if-no or methods in the parent.
		p2.m1();
		
		MyInterface int1 = new childA();  //can only access overridden methods.
		int1.m2();
		
						
		MyInterface int2 = new childB();  // can only access overridden methods.
		int2.m2();
	}
	
	

}

class Parent{
	public void m1() {}
}

interface MyInterface{
	public abstract void m2();
}
class childA extends Parent implements MyInterface{
	public void m2()	{}
	public void m3()	{}
}
class childB extends Parent implements MyInterface{
	public void m2()    {}
	public void m4()    {}
}