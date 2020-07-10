package day9_ControlFlowStatements_Part3;

public class laptopModel {

	public static void main(String[] args)
	
	{
		String computer;
		
		computer="Del";
		
		switch (computer){
		case"Apple":
			System.out.println("No virus");
			break;
		case"Dell":
		     System.out.println("Though one");
		     break;
		case"Acer":
			 System.out.println("Not Recommended");
			 break;
		default:
			System.out.println("Do not buy that one");
		
		}
		

	}

}
