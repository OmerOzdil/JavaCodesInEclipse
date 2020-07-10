package day40_methodHiding_composition;

public class BedroomTest {

	public static void main(String[] args) {
		
		Wall wall1 = new Wall("North");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("Up");
		Wall wall4 = new Wall("Down");
		
		Ceiling ceiling = new Ceiling(25, "Black");
		Bed bed = new Bed("Good","5", 34, 3, 45);
		Lamp lamp = new Lamp("Nice", 35);
		
		Bedroom bedroom = new Bedroom("Omer", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		bedroom.getBed().make();
		bedroom.getLamp().turnOn();
		
		System.out.println(bedroom.getWall1().getDirection());
		System.out.println(bedroom.getWall1().toString());
		
		
		
		

	}

}
