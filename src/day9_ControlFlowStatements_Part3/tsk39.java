package day9_ControlFlowStatements_Part3;

public class tsk39 {

	public static void main(String[] args) {
		char color='o';
		
		switch (color) {
		
		case'R': case'r':
			System.out.println("Red light");
			break;
		case'O':case'o':
			System.out.println("Orange light");
			break;
		case'G':case'g':
			System.out.println("Green Light");
			break;
			default:
			System.out.println("No colour");
		
		}

	}

}
