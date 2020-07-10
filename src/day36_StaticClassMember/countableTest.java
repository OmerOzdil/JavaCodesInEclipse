package day36_StaticClassMember;

public class countableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		
		Countable obj1 = new Countable();	
		Countable obj2 = new Countable();
		Countable obj3 = new Countable();
		
		objectCount=obj1.getInstanceCount();
		
		System.out.println(objectCount);
		System.out.println(Countable.instanceCount);

	}

}
