package Main;
import java.util.*;

public class TokenizerTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		StringTokenizer tokenizer;
		tokenizer = new StringTokenizer(in.nextLine(), "/", true);
		
		in.close();
		System.out.println(tokenizer.nextElement());

	}

}
