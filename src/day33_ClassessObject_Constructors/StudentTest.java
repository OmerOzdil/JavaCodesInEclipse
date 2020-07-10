package day33_ClassessObject_Constructors;

public class StudentTest {

	public static void main(String[] args) {


		Student s1 = new Student("Omer", 34, 'M', 2017, "Java", "Cybertek");
		Student s2 = new Student("Smith", 56, 'F', 2918, "TS", "Cybertek");
		
		s1.attendLecture();
		s2.submitAssignment();
	}

}
