package day15_methods_Parts3;

public class task68Retirement {

	public static void main(String[] args) {
		
		
		yearsUntilRetirement("Mike", 1995);

	}

	public static int calculateAge(int yearBirth) {
		
		
		int age= 2019-yearBirth;
		return age;
	}
	
	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementAge=65-calculateAge(year);
		if (retirementAge<=0) {
			System.out.println("congr");
		}else {
			System.out.println(name+ " retires in "+ retirementAge+ " years" );	
		}
		
		
	}

}
