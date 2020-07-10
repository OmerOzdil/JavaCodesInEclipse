package day35_Encapsulation;

public class DenemeClass {

	private int age;
	private String name;
	
	public DenemeClass(int age, String name) {
		this.age=age;
		this.name=name;
		System.out.println("Name is "+ name+ "Age is "+age);
	}
	public void print() {
		
		System.out.println("Name is "+ name+ "Age is"+age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		if(name.contains("1")) {
			
			return "Not possible";
		}else 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
