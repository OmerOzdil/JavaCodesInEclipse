package extra_Practices;

public class ColoursTest {
	
	public static void main(String[] args) {
		
		
		/*
		white wh = new white();  // regular way to create an object
		wh.draw();
		wh = new black();  // not permission with the same method name
        */
		
		colours cl = new white();   // ploymorphic way to create an object
		  cl = new black();
		  cl.draw();
		  cl = new white();
		  cl.draw();
		 
		  ColoursTest cT = new ColoursTest();
		  //cT.testing();
		
	}
	

}


 

