package day9_ControlFlowStatements_Part3;

public class test {

	public static void main(String[] args) {
		
		int numberOfCall;
		numberOfCall=180;
	double payment;
		payment=250;
		
		if(numberOfCall<=100) {
			System.out.println("Your payment is $"+ payment);
			}
		if(numberOfCall>100 && numberOfCall<=150) {
		    double ext1=0.6*(numberOfCall-100);
		    payment=payment+ext1;
		    System.out.println("Your payment is $"+ payment);
		} 
		if(numberOfCall>150 && numberOfCall<=200) {
			double ext2=50*0.6;    
			double ext3=0.5*(numberOfCall-150);
			payment=payment+ext2+ext3;
			System.out.println("Your payment is $"+ payment);
		}
		if (numberOfCall>200) {
			double ext2=0.6*50, ext3=0.5*50;
			double ext4=ext2+ext3+(0.4*(numberOfCall-200));
			
			payment=payment+ext4;
			System.out.println("Your payment is $"+ payment);
			{
			
			System.out.println("***************");
			
			int year=1600;
			
			if( year%100==year%400) {
				System.out.println(year+"is the leap year");
			}
			else {
				System.out.println(year+"is not a leap year");
			             }
			}
		}
	}
}		
		
		    
		
		

	


