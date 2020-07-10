package day28_arrays_Lab;

public class Question19 {

	public static void main(String[] args) {
		
		int[] a = {1,2,2};
		int[] b= {1,2,2,6,99,99,7};
		int[] c= {1,1,6,7,2};
		int[] d= {1,2,2,6,99,99,7,3,4};
		int[] e= {1,1,6,2};
		
		System.out.println(sum(a));
		System.out.println(sum(b));
		System.out.println(sum(c));
		System.out.println(sum(d));
		System.out.println(sum(e));
		
		
	

	}
	public static int sum(int[] x) {
		int sum=0;
		int counter=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]!=6) {
				
				sum=sum+x[i];
				counter++;
			}else
				break;	
		}
		int a=0;
		for(int j=counter; j<x.length; j++) {
			a++;
			if(x[j]==7) {
				break;
			}
		}
			for(int k=a+counter; k<x.length;k++) {
				sum=sum+x[k];
		}
		
		return sum;
	}

}
