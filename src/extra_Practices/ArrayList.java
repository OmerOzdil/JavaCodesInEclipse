package extra_Practices;

public class ArrayList {

	public static void main(String[] args) {
		String[] arry ={"1etsy#2wooden#3spoon","add","4","aaa"};
		
		 System.out.println(lameDb(arry));

	}
	public static String lameDb(String[] arr) {
		
		if(arr[1]=="add") {
			arr[0]=arr[0]+"4#"+arr[arr.length-1];
			return arr[0];	
		}
		return null;
		
		
	}

}
