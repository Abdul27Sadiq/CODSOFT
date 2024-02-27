package INTERNSHIP;
import java.util.*;
public class STUDENT_GRADE_CALCULATOR {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no of Subjects:");
		int subject=scn.nextInt();
		int Total_Marks=0;
		for(int i=1;i<=subject;i++) {
			System.out.println("Marks Obtained in "+i+": ");
			int marks=scn.nextInt();
			Total_Marks=Total_Marks+marks;
		}
		Float Average_Percentage=(float) (Total_Marks/subject);
		System.out.println("Total Marks Obtained:" +Total_Marks);
		System.out.println("Average Percentage(%):" +Average_Percentage);
		if(Average_Percentage>=90) {
			System.out.println("Grade: O");
		}
		else if(Average_Percentage>=80) {
			System.out.println("Grade: A");
		}
		else if(Average_Percentage>=70) {
			System.out.println("Grade: B");
		}
		else if(Average_Percentage>=60) {
			System.out.println("Grade: C");
		}
		else if(Average_Percentage>=50) {
			System.out.println("Grade: D");
		}
		else if(Average_Percentage>=40) {
			System.out.println("Grade: E");
		}
		else {
			System.out.println("fail");
		}
	}

}
