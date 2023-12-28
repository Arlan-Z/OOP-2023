package Practice_5;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 operand, result = 0.0;
       String                 operator, buf = null;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), " +-/*", true);
       
       in.close();

       try
       {
          result = Double.parseDouble(tokenizer.nextToken());

          while(tokenizer.hasMoreTokens())
          {
        	  operator   = tokenizer.nextToken();
        	  buf = tokenizer.nextToken();
        	  operand = Double.parseDouble(buf);
        	  
	          switch(operator)
	          {
	          case("-"):
	        	  	result -= operand;
	          		break;
	          	
	          
	          case("+"):
	        	  result += operand;
		          break;
	          
	          case("*"):
	        	  	result *= operand;
	          		break;
	          
	          case("/"):
	        	  result /= operand;
		          break;
		      
	          case(" "):
	        	  System.out.println("Result: " + result);
	          	  result = operand;
	          	  break;	
		      
	          default:
	        	  System.out.println("Result: " + result);
//	        	  result = Double.parseDouble(tokenizer.nextToken());
	        	  break;
	          
	          }
          }
          
          System.out.println("Result: " + result);

       }
       catch (NoSuchElementException nsee)
       {
    	  
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
    	   System.out.println("This operand " + buf + " is not a number with coodinates ");
       }
       


    }
}
