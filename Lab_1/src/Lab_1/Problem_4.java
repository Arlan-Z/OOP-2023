package Lab_1;
import java.util.Scanner;

public class Problem_4 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		in.close();
		
		double sqrtD = Math.sqrt((b * b - 4 * a * c));  
	
		if(sqrtD < 0) 
		{
			System.out.print("ERROR");
			return;
		}
		
		if(sqrtD > 0)
		{
			System.out.println((-b + sqrtD) / (2  * a));
		}
		
		System.out.println((-b - sqrtD) / (2 * a));
				
				
	}

}
