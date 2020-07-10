package extra_Practices;

public class Person1Excercise {
	
	private String firstName;
	  private String lastName;
	  private int age;
	  
	  public Person1Excercise(){
	    this.firstName="undefined";
	    this.lastName="undefined";
	    this.age=-1;
	  }
	  public Person1Excercise (String name, String lastName, int age) {
	  this.firstName=name;
	  this.lastName=lastName;
	  this.age=age;
	  
	}

	public void setfirstName(String setfirstName){
	  this.firstName=setfirstName;
	}
	public String getfirstName(){
	  return firstName;
	}
	public void setlastName(String lastName){
	  this.lastName=lastName;
	}
	public String getlastName(){
	  return lastName;
	}
	public void setAge(int age){
	  this.age=age;
	}
	public int getage(){
	  return age;
	}
	
	
	@Override
	public String toString() {
		return "Person1Excercise [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
