package Lab_1;
import java.util.Scanner;


public class Problem_3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int grade = in.nextInt();
		in.close();
		
		
		if (grade >= 95) {
			   System.out.print("A");
			   return;
			  }
		if (grade >= 90 ) {
			   System.out.print("A-");
			   return;
			  }
		if (grade >= 85) {
			   System.out.print("B+");
			   return;
			  }
		if (grade >= 80) {
			   System.out.print("B");
			   return;
			  }		
		if (grade >= 75) {
			   System.out.print("B-");
			   return;
			  }		
		if (grade >= 70) {
			   System.out.print("C+");
			   return;
			  }
		if (grade >= 65)
			{
				System.out.print("C");
				   return;
			}
		if (grade >= 60)
			{
				System.out.print("C-");
				   return;
			}
		if(grade >= 55)
			{
			System.out.print("D+");
			   return;
			}
		if(grade >= 50)
			{
				System.out.print("D");
				   return;
			}
		System.out.print("F");
		
		
		
		
		

	}

}
