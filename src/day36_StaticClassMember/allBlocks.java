package day36_StaticClassMember;

public class allBlocks {


	
	public allBlocks(int x) {
		System.out.println("One args constructor");	
	}
	public allBlocks() {
		System.out.println("No arg constructor");

	}
	
	static {
		
		System.out.println("first static nt");
	}
	{
		System.out.println("first instance init");
	}
	{
		System.out.println("Second instance int");
	}
	static {
		System.out.println("Second static init");
	}

}

