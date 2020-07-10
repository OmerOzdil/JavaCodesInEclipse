package extra_Practices;

public class dog1 extends animal {
	
	
	
	String breed;
	int humanYears;
	public dog1(String name, int humanYears, String breed) {
		super(name,humanYears);
		this.breed=breed;
		this.humanYears= getAgeInHumanYears(humanYears);
	}
	@Override
	public int getAgeInHumanYears(int humanYears) {
		if(humanYears<=2) {
			return humanYears*11;
		}else
			return 22+(humanYears-2*5);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	@Override
	public String toString() {
		return "dog1 /n[breed=" + breed + ", humanYears=" + humanYears + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
