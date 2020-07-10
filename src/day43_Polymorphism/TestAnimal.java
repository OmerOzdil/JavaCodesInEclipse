package day43_Polymorphism;



public class TestAnimal {

	public static void main(String[] args) {

		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Birds();
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Birds();
		

	}

}

 class Animal{}

 class Dog extends  Animal{}
 
 class Birds extends Animal{}