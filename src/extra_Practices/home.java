package extra_Practices;

public  abstract class home {
	
	
	String omr="Omer";
	public home(String omr) {
		this.omr=omr;
		System.out.println("Hello from parent"+ omr);
	}
	
	
	static{
		
		System.out.println("Static block in home");
	}
	
	{
		
		System.out.println("Initilaztion block in home");
	}
	
	
	public abstract void balcony();

}
