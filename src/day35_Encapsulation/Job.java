package day35_Encapsulation;

public class Job {
	
	private String title;
	private String Company;
	private int annualSalary;
	
	public Job() {
		System.out.println("No-args constructor");
		this.title="Undefined";
		this.Company="Undefined";
	}
	public Job(String title) {
		System.out.println("One-arg constructor");
		this.title=title;
		this.Company="undefiened";
		
	}
	public Job(String title, String company, int annualSalary) {
		System.out.println("Three-args constructor");
		setTitle(title);
		setCompany(company);
		this.annualSalary = annualSalary;
		
		
		
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getTitle() {
		//condition
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		//condition
		Company = company;
	}
	
	public String toString() {
		return "Job [title=" + title + ", Company=" + Company + ", annualSalary=" + annualSalary + "]";
	}
	
	

}
