package day36_StaticClassMember;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Mike", 30, 12345);
		Student s2 = new Student("Smith", 35,99);
		Student s3 = new Student("Ozzy", 45, 976);
		s1.school="Cybertek2";
	
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(Student.school); //you can also call static the field with class name.

	}

}
