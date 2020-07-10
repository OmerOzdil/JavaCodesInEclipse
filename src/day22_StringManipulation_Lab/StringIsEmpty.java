package day22_StringManipulation_Lab;

public class StringIsEmpty {

	public static void main(String[] args) {


		String UserName="";
		String password="";
		
		if(UserName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Usernam is not empty");
		}
		
		if(UserName.isEmpty() || password.isEmpty()) {
			System.out.println("Usernam or password can not be empty");
		}else {
			System.out.println("Usernam or Password is not empty");
		}

	}

}
