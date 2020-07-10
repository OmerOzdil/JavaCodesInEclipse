package day43_Polymorphism;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeArray {

	public static void main(String[] args) {
		
		int[] number = new int[4];  //number holds 3 integere numbers
		
		shape[] shapes = new shape[3]; //  holds 3 objects.
		
		shapes[0] = new triangle();
		shapes[1] = new Square();
		shapes[2] = new Circle();
		System.out.println(shapes[2].equals(new Square()));
		
		for(shape sh: shapes) {
			
	       sh.draw();
		}
		
		List<shape> shapeList = new ArrayList<>();  //polymorphic way
		
		shapeList.add(new triangle());
		shapeList.add(new Circle());
		shapeList.add(new Square());
		
		

	}

}
