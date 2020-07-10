package day39_finalKeyword;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RAGE=600;
	public static final String ADMIN_USER;
	
	public final int MODEL_3_MAX_SPEED; // if not'initilasion on the instance variable you have initiliase it in the constructor if not not accept
	public FinalVariables() {
		MODEL_3_MAX_SPEED=190;
	}
	static {
		ADMIN_USER="abc";
	}

	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT =5;
		
		final double PI= 3.14;
		
		final int SSN;
		SSN=66666;
		
		FinalVariables finalVari = new FinalVariables();
		//System.out.println("Max range for roadster"+ ROADSTER_MAX_RAGE); // error because it is instance variable
		System.out.println("Max range for roadster"+ finalVari.ROADSTER_MAX_RAGE);  // you can only call it by object.
		System.out.println("Admin"+ ADMIN_USER); // You call without objcet beacuse it is static.																
	}

}
