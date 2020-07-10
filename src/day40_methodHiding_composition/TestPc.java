package day40_methodHiding_composition;

public class TestPc {

	public static void main(String[] args) {

			Dimensions dimensions = new Dimensions(20, 20, 5);
			
			Case theCase = new Case("220B", "Dell", "240", dimensions);
			
			Monitor theMonitor = new Monitor("246B", "Mac", 24, new Resolution(2540, 1440)); // you can create either object in a normal way
			
			MotherBoard theMotherBorad = new MotherBoard("bj- 200", "Lenova", 4, 6, "v2.44");
			
			PC thePc = new PC(theCase, theMonitor, theMotherBorad);
			
			theMonitor.drawPixel(150, 1200, "red");
			
			thePc.getMonitor().drawPixel(155, 325, "Yellow");
			
			//thePc.getMotherBoard().loadProgram("Windows 1.0");
			
			thePc.getTheCase().pressPowerButton();
					
					

	}

}
