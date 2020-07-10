package day7_ControlFlowStatements;

public class ifElseStatement {

	public static void main(String[] args) {
		
		int score=60;
		
		if(score>=70) {
			
			
			System.out.println("Excellent");
			System.out.println("You have passed with A");
			
			
		}else 
		{
			System.out.println("You Failed so you just need to study a bit more");
			
		}
		System.out.println("********");
		
		int sales, bonus;

		double commisonRate, salary;

		salary=10000;
		sales=6000;

		if(sales>5000) {
			
			bonus=500;
			commisonRate=1.12;
			salary=salary*commisonRate+bonus;
			
			System.out.println("salary= "+ salary);
	}
		else {
			bonus=100;
			commisonRate=salary*1.05;
			salary=commisonRate+bonus;
			System.out.println(salary);
		}
	}
}
