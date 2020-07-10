package extra_Practices;

public class LawSchool extends EducationalInstitution {
	
	public LawSchool(int years){
	    super(years);
	    } 
	      public String GraduationRequirements(){
	    	  
	        return super.GraduationRequirements()+ " and passing the bar";
	      }
	
	
	

}
