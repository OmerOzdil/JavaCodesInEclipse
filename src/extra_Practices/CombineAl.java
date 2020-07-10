package extra_Practices;

import java.util.ArrayList;
public class CombineAl {
	
	public static void main(String[] args){
		  
		  ArrayList<String> wordList1 = new ArrayList<>();
		  ArrayList<String> wordList2 = new ArrayList<>();
		  
		  wordList1.add("Omer");
		  wordList1.add("Busra");
		  wordList2.add("Adil");
		  wordList2.add("Kubra");
		  
		  combineAl(wordList1,wordList2);
		 
	} public static void combineAl(ArrayList<String> ar1, ArrayList<String> ar2){
		
	ArrayList<String> cmb = new ArrayList<>();
	
	cmb.addAll(ar1);
	cmb.addAll(ar2);
	
	System.out.println(cmb);
	
}
}
