package extra_Practices;

public class Person1Test {

	public static void main(String[] args) {
		
	Person1Excercise person = new Person1Excercise();
	   System.out.println( person.toString());
	   
	   person.setfirstName("John");
	   person.setlastName("Doe");
	   person.setAge(44);
	   
	   System.out.print(person.getfirstName()+"|");
	   System.out.print(person.getlastName()+"|");
	   System.out.println(person.getage());
	    
	    
	    Person1Excercise person1 = new Person1Excercise("Omer","Ozdil", 35);
	   System.out.println( person1.toString());
	   

	}

}
