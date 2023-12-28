package Task_1;

public class DVD extends LibraryItem{
	
	public DVD(int price, String name, int publication_year)
	{
		super(price, name, publication_year);
	}
	
	public void print()
	{
		System.out.print("Im a disc!, my name is " + name);
	}
	
	
}
