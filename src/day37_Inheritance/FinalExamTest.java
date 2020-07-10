package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int questions;
		int missed;
		System.out.println("How many questions are thew in the fonal exam?");
		questions=sc.nextInt();
		
		System.out.println("How mant questions did the student miss");
		missed=sc.nextInt();
		
		FinalExam s1 = new FinalExam(questions,missed);
		System.out.println("The garde for the exam is "+ s1.getGrade());

	}

}
