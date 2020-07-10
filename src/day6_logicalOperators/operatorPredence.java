package day6_logicalOperators;



public class operatorPredence {

	public static void main(String[] args) {
		int applesCount=20;
		int orangesCount=30;
		int pearsCounts=30;
		boolean res=applesCount<orangesCount || orangesCount>=pearsCounts;
		System.out.println(res);

	}

}
