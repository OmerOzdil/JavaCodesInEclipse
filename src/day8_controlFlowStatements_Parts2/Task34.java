package day8_controlFlowStatements_Parts2;

public class Task34 {

	public static void main(String[] args) {
	int math, che, bio;
     math=0;
     che=8;
     bio=0;
     double ave=(math+che+bio)/3;
     
     System.out.println("Average"+ ave);
     
     if(ave>=0 && ave<=59) {
    	 System.out.println("Grade is F");
     }else if(ave>=60 && ave<=69) {
    	 System.out.println("Grade is D");
     }else if(ave>=70 && ave<=79) {
    	 System.out.println("Grade is C");
     }else if(ave>=80&& ave<=89) {
    	 System.out.println("Grade is B");
     }else if(ave>=90 && ave<=100) {
    	 System.out.println("Grade is A");
     }
    	 
     

			

	}

}
