package Lab_1;
import java.util.Scanner;


public class Problem_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int money = in.nextInt();
		int interest = in.nextInt();
		
		in.close();
		
		
		System.out.print(money * (100 + interest) / 100);
		
		

	}

}
