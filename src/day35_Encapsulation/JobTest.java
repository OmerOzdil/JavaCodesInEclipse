package day35_Encapsulation;

import java.util.ArrayList;

public class JobTest {

	public static void main(String[] args) {


		Job job1= new Job();
		
		Job job2 = new Job("Java Developer");
		
		Job job3 = new Job("SDET", "Amazon", 130000);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		// create a list of Jobs
		//add 5 different jobs with company salary title
		
		ArrayList<Job> JobList = new ArrayList<>();
		JobList.add(job3);
		JobList.add(new Job("SM", "abc", 170000));
		JobList.add(new Job("BA","xxx", 5000));
		
		
		System.out.println(JobList.toString());
		
		//Find the highest paying job and print it.
		
		double maxSalary=0;
		int highestIndex=0;
		
		for(int i=0; i<JobList.size();i++) {
			
			if(JobList.get(i).getAnnualSalary()>maxSalary) {
				
				maxSalary=JobList.get(i).getAnnualSalary();
				highestIndex=i;
			}
		}
		System.out.println(JobList.get(highestIndex).getAnnualSalary());
		
	}

}
