package day16_ClassObjects;

public class cellPhoneObjects {

	public static void main(String[] args) {


		CellPhone cell1 = new CellPhone();
		CellPhone cell2 = new CellPhone();
		
		
		cell1.brand="Iphone";
		cell1.color="Grey";
		cell1.price=600;
		cell1.secreenSize=15;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		System.out.println(cell1.secreenSize);
		
		
		cell1.color="Black";
		System.out.println(cell1.color);
		
		
		cell2.brand="Nokia";
		cell2.color="white";
		cell2.price=650.50;
		cell2.secreenSize=20;
		System.out.println(cell2.brand);
		
		System.out.println("Brand:"+ cell2.brand);
		System.out.println("Color: "+ cell2.color);
		System.out.println("Price:"+ cell2.price);
		
		
		System.out.println("***Calling Methods***");
		
		cell1.call();
		cell1.message();
		cell1.takePhoto();
		
		cell2.call();
		cell2.message();
		cell2.takePhoto();
		
	}
	
	

}
