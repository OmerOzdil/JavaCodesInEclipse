package day41_abstraction;

public interface Electric {
	
	public static final boolean HAS_BATTERIES=true;
	
	boolean HAS_BATTERIES2=false;    //public static final
	
	public abstract void charge();
	void charge2();        			 //public abstract
	
	public default void methodA() {  // default is not access modifier 
		// code
	}
	public static void methodB() {
		
		//code
	}
}
