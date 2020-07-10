package day16_ClassObjects;

public class dogObject {

	public static void main(String[] args) {


		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog();
		
		dog1.age=10;
	    dog1.Breed= "Maltese";
	    dog1.color="Red";
	    dog1.name="Mike";
	    dog2.age=20;
	    dog2.name="Tyson";
	    dog3.name="Omer";
	    dog3.color="Green";
	    		
	    
	    System.out.println(dog1.Breed);
	    System.out.println(dog1.age);
	    System.out.println(dog1.color);
	    System.out.println("*********************");
	    dog1.barking();
	    dog1.hungry();
	    dog1.sleeping();
	    dog2.hungry();
	    dog2.sleeping();
	    dog3.barking();
	}

}
