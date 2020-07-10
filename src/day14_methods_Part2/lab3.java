package day14_methods_Part2;

public class lab3 {

	public static void main(String[] args) {
		
  specialEleven(35);
	}
	public static void specialEleven(int x) {
		if(x%11==0 || x%11==1) {
			System.out.println("this number is special of 11");
		}else {
			System.out.println("this number is not special to 11");
		}
	}

}
