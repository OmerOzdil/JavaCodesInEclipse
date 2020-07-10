package day20_StringManipulationPart2;

public class Task81 {

	public static void main(String[] args) {
		
	String time="10/10/2019 14:59:00";	
	dateFormat(time);
	
	System.out.println(dateFormat(time));

	}

	
	public static String dateFormat( String report) {
		
		 report=report.replace("/","").replace(" ","").replace(":","");
		 return report;
	}
	
}
