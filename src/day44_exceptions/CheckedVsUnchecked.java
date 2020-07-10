package day44_exceptions;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
