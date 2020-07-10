package day39_finalKeyword;

public class FinalMethod {

	public final void method1() {					// if method is final it can not be override it.
		System.out.println("Method-1");
		}
		
		public static void staticMethod(String word) {
			System.out.println("Static Methods");
		}
}		
	class Sub extends FinalMethod{
	/*		
			@Override
	public void method1() {
				System.out.println("Method-1 in sub class");
	}
	*/	
			
			
	public static void staticMethod(String word) {
				System.out.println("Static Method in sub class");			
	}
	
}
	

