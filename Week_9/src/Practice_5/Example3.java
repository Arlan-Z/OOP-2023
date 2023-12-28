package Practice_5;
public class Example3
{
    public static void main(String[] args)
    {
	int              i;
	int[]            data = {50, 320, 97, 12, 2000, 400};

	for (i=0; i < data.length + 1; i++)
    {
	try 
        {
	    
		System.out.println(data[i]);
	    
	} 
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
	    System.out.println("Done");
	}
    }
    }
}
