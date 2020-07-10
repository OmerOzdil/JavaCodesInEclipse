package day20_StringManipulationPart2;

public class String_IndexOf {

	public static void main(String[] args) {
		
		
		String word1="github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("ch"));
		System.out.println(word1.indexOf("hub"));
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Pos of . "+ i);
		
		System.out.println(url.charAt(i+1));
		
		String title="Java - Google Search";
		
		int dash=title.indexOf("-");
		System.out.println(dash);
		System.out.println(title.charAt(dash-1));
		System.out.println(title.charAt(dash+1));
		System.out.println("Apple");
		
		String country="United states of America";
		int states=country.indexOf("states");
		System.out.println("Position of states: "+ states);
		
		
		String word2="java, c++, pyton, tomcat, eclipse";


		if(word2.contains("java, ")) {
			System.out.println("Java is there");
		}else {
			System.out.println("Java is not there");
		}
		
		if(word2.indexOf("c++")>-1) {
			System.out.println("C++ is there");
			
		}else {
			System.out.println("C++ is not there"
					+ "");
		}
		
		
		String str="Omer";
		String str1="Omer";
		
		
		}
			
	}
	
	


