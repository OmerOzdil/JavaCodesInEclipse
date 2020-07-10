package day20_StringManipulationPart2;

import java.util.Scanner;

public class Task82_Username {

	public static void main(String[] args) {
		
		
		Scanner Login= new Scanner(System.in);
		
		System.out.print("Enter your UserName: ");
		
		String UserName=Login.nextLine();
		
		System.out.print("Enter your Password: ");
		
		String PassWord=Login.nextLine();
		
		String UserNameInSystem="Omer";
		String PassWordInSystem="123";
		
		if(UserName.equals("")&& PassWord.equals("")) {
			System.out.println("Username and password can not be empty");
		}else if(UserName.equals("")&& !PassWord.equals("")) {
			System.out.println("Username can not be empty");
		}else if (!UserName.equals("") && PassWord.equals("")) {
			System.out.println("Password can not be empty");
		}else if (!UserName.equals(UserNameInSystem)|| !PassWord.equals(PassWordInSystem)){
			System.out.println("Username or Password not valid. please verify");
		}else if(UserName.equals(UserNameInSystem)&& PassWord.equals(PassWordInSystem)) {
			System.out.println("You logged in successfully");
		}

	}

}
