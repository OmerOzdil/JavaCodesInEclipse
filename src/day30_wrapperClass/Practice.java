package day30_wrapperClass;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		String x="Omer bak bu aksam nele oluyor";
		
		String[] y=x.split(" bak");
		for( String value: y) {
			System.out.println(value);
		}


	}

}
