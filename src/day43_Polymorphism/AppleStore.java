package day43_Polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		
		AppleDevice mac = new Mac();
		
		mac.use();
		//mac.code(); no overrriden so gives error
		
		Mac newMac = new Mac();
		newMac.use();
		newMac.code();
		
		AppleDevice watch = new AppleWatch();
		watch.use();

	}

}
