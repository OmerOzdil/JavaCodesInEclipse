package day38_inheritance_part2;

public class Company {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		FullTimeEmploye ft = new FullTimeEmploye();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40);

	}

}
