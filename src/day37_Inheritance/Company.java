package day37_Inheritance;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.name="Tom";
		emp1.age=36;
		emp1.jobTitle="Teacher";
		emp1.gender='F';
		
		emp1.work();
		System.out.println(emp1.toString());;

	}

}
