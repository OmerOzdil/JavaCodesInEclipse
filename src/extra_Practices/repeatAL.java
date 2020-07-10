package extra_Practices;

import java.util.ArrayList;

public class repeatAL {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		Method(list);
		
	}
	public static void Method(ArrayList<Boolean> list) {
		
		ArrayList<Boolean> list1 = new ArrayList<>();
		
		list1.addAll(list);
		list1.addAll(list1);
		System.out.println(list1);
		
	}

}
