package Lab_1;

import java.util.Scanner;

public class Analazyer {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 String input = in.next();
		 	
		 Data numberOperations = new Data();
		 
		 while(input.charAt(0) != 'Q')
		 {
			 numberOperations.Scanner(input);
			 input = in.next();
		 }
		 in.close();
		 
		 System.out.print(numberOperations.toString());
	}

}
