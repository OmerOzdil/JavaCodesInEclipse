package day38_inheritance_part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");

     //dog.eat();
     //dog.chew();
		
		dog.eat(); // find the calls and run the eat class. 
		//if does not exit in dog class check there is any is-a 
		// relationship if yes- go to parent and look for eat()
		
		dog.run();
		dog.move(10);
	}

}
