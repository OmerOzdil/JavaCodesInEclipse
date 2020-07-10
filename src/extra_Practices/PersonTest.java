package extra_Practices;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		System.out.println(person.getFirstName());
		System.out.println(person.getSecondName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		
		person.setFirstName("John");
		System.out.println(person.getFirstName());
		System.out.println(person.toString());
		
		
		Person person1 = new Person("Omer", "Ozdil", 34);
		
		System.out.println(person1.getFirstName().contains("K"));
	}

}
