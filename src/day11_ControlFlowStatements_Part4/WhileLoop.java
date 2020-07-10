package day11_ControlFlowStatements_Part4;

public class WhileLoop {

	public static void main(String[] args) {


		int i=0;
		while(i>=-10) {
			System.out.print(i);
			i-=1;
		}
		
		for(int a=0; a<=10;a++)
			System.out.println(a);
		
		int numberOfStudents=1;
				while(numberOfStudents<=10) {
					System.out.println("Number of Students "+ numberOfStudents);
					numberOfStudents++;
				}
					

	}

}
