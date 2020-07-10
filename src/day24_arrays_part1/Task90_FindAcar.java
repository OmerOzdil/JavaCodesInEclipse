package day24_arrays_part1;

public class Task90_FindAcar {

	public static void main(String[] args) {
		String[] Cars= {"Mercedes","Nissan","Toyota","Porche","Ferrari"};
		
		boolean flag=false;
		
		for(int i=0;i<Cars.length;i++) {
			
			if	(Cars[i].equals("Honda")) {
				
				flag=true;
				break;
			}
			
			}
		
		if(flag) {
			System.out.println("Found it");
			
		}else {
			System.out.println("not find it");
		}
		
		

	}

}
