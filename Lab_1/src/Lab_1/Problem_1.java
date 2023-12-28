package Lab_1;
import java.util.Scanner;
public class Problem_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		in.close();
		
		for(int i = 0; i < name.length() + 2; i++)
		{
			if(i == 0 || i == name.length() + 1) System.out.print("+");
			else System.out.print("-");
		}
		
		System.out.println();
		
		for(int i = 0; i < name.length() + 2; i++)
		{
			if(i == 0 || i == name.length() + 1) System.out.print("|");
			else System.out.print(name.charAt(i - 1));
		}
		
		System.out.println();
		
		for(int i = 0; i < name.length() + 2; i++)
		{
			if(i == 0 || i == name.length() + 1) System.out.print("+");
			else System.out.print("-");
		}
	}

}
