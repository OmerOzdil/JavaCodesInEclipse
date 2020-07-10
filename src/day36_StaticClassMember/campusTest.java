package day36_StaticClassMember;

public class campusTest {

	public static void main(String[] args) {
		
		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		System.out.println(Campus.country);
		c2.country="Sakarya";
		System.out.println(c2.country);
		System.out.println(c1.country);
		
		

	}

}
