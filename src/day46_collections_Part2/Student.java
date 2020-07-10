package day46_collections_Part2;

public class Student implements Comparable<Student> {
	

	private int id;
	private String name;
	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	// returns an int, accepts object of certain type.
	// returns positive value if first object is greater than than second.
	// returns negative value if first object is less than second.
	// returns 0 if first object is equals to second.
	@Override
	public int compareTo(Student anotherStudent) {
		if(this.id> anotherStudent.id) {
			return 1;
		}else if(this.id<anotherStudent.id) {
			return -1;
		}else
			return 0;
	}
	
	

}
