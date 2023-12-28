package Lab_1;
import java.util.Scanner;


public class Problem_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sqrLen = in.nextInt();
		
		
		in.close();
		
		System.out.println("Perimeter " + 4 * sqrLen);
		System.out.println("Area " + sqrLen * sqrLen);
		Double diag = Math.sqrt(2) * sqrLen;
		System.out.println("Diagonal " + diag);
		

	}

}
