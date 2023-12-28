package Lab_1;
import java.util.Scanner;



public class Problem_6 {
	
	
	public static boolean  checkIfPolindrome(String Text)
	{
		for(int i = 0; i < Text.length(); i++)
		{
			if(Text.charAt(i) != Text.charAt(Text.length() - 1 - i)) return false;
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String text = in.next();
		
		in.close();
		
		if(checkIfPolindrome(text)) System.out.print("YES");
		else System.out.print("NO");

	}

}
