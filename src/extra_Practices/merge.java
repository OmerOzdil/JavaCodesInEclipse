package extra_Practices;

public class merge {

	public static void main(String[] args) {

		String str="abcde";
		String str1="12345";
		System.out.println(merge(str,str1));
		
		

	}public static String merge(String str, String str1) {
	
		String dummy="";
		int l;
		if(str.length()>str1.length()) {
			l=str.length();
		}else
			l=str1.length();
		
		
		for(int i=0;i<l; i++ ) {
			
			if(i<str.length()) {
				dummy=dummy+str.charAt(i);
			}
			if(i<str1.length()) {
				dummy=dummy+str1.charAt(i);
			}
		}		
		return dummy;
	}

}
