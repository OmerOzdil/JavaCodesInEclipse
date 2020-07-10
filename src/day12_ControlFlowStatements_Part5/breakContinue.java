package day12_ControlFlowStatements_Part5;

public class breakContinue {

	public static void main(String[] args) {


		for(int i=1;i<=5; i++) {
			
			if(i==4) {
				break;
				
			}
			System.out.println(i);
		}
		
		System.out.println("***************");
		
		for(int a=1;a<=5;a++) {
			if(a==4) {
				continue;
			}
			System.out.println(a);
		}

	}

}
