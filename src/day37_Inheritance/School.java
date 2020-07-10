package day37_Inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name="Mike";
		person.age=34;
		person.gender='M';
		
		student.name="Smith";
		student.age=18;
		student.gender='M';
		
		person.eat("Pizza");
		student.eat("Egg");
		
		student.code("Java");
	

	}

}
