package day36_StaticClassMember;

public class Bicycle {
	
	String name;
	static int age=34;
	String city="Sakarya";
	
	
	public Bicycle() {
		System.out.println("Weolcome");

	}

	public static void main(String[] args) {
		Campus c = new Campus("Sakarya");
		System.out.println(age);
		System.out.println(c.country);
		
		Bicycle b = new Bicycle();
		System.out.println(b.name);
	}

}
