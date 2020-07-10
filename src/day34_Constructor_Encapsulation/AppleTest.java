package day34_Constructor_Encapsulation;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		System.out.println(a1.color);
		
		changeApple(a1);
		System.out.println(a1.color);

	}
	public static void changeApple(Apple b1) { // we put apple in oerder reach apple method
		b1.color="Orange";
	}

}
