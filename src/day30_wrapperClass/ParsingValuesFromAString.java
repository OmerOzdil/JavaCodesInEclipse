package day30_wrapperClass;



public class ParsingValuesFromAString {

	public static void main(String[] args) {
		
		String numberAsString="2018";
		
		numberAsString+=1;
		System.out.println(numberAsString);
		
		int number= Integer.parseInt(numberAsString);
		System.out.println(number);
		
		
		numberAsString=numberAsString+1;
		number+=1;
		System.out.println(number);
		System.out.println(numberAsString);
		
		double num2=Double.parseDouble(numberAsString);
	
		System.out.println(num2);
		
		int i2=Integer.parseInt("10");
		
		
	 
		
		int i=10;
		String s= String.valueOf(i);
		System.out.println(s);   ///it will return the "10"
		s+=1;
		System.out.println(s);
		
		
		String s2=Integer.toString(i);
		System.out.println(s2); // it will return the "10"

	}

}
