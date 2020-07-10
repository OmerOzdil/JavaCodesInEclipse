package day38_inheritance_part2;

public class PersonTest {

	public static void main(String[] args) {
		
		Student s= new Student();
		
		s.display();
			
			
		
	}

}

class Person{
	
	public void message() {
		System.out.println("This is person message");
	}
}
class Student extends Person{
	
	@Override
	public void message() {
		System.out.println("This is student message");
	}
	public void display() {
		message();
		super.message();
	}
}
