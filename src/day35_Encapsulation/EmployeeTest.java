package day35_Encapsulation;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {


		Employee e1 = new Employee();
		Employee e2 = new Employee("Mark Jones.",39119);
		Employee e3 = new Employee("Tedd Britt.", 81774, "Sales", "Sales Person");
		
		e1.setName("Mike Smith.");
		e1.setIdNumber(478899);
		e1.setDepartment("Accounting");
		e1.setPosition("VP");
		
		System.out.println(e1.getName()+"|"+ e1.getIdNumber()+" | "+ e1.getDepartment()+ "|"+e1.getPosition());
		System.out.println(e2.getName()+" | "+ e2.getIdNumber()+" | "+ e2.getDepartment()+ " | "+e2.getPosition());
		System.out.println(e3.getName()+"  | "+ e3.getIdNumber()+" | "+ e3.getDepartment()+ "  | "+e3.getPosition());
		
		ArrayList<Employee> EmployeeList = new ArrayList<>();
		
		EmployeeList.add(new Employee("Mike Smith", 47899, "Accounting", "VP"));
		EmployeeList.add(new Employee("Mark Jones.",39119, "IT", "Developer"));
		EmployeeList.add(new Employee("Tedd Britt", 81774, "Sales", "Sales Person"));
		
		
		System.out.println(EmployeeList.toString());
		
		System.out.println(e1.getName()+ e1.getIdNumber()+ e1.getDepartment()+ e1.getPosition());	

	}

}
