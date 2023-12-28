package Task_1;

public class Magazine extends LibraryItem{
	
	public Magazine(int price, String name, int publication_year)
	{
		super(price, name, publication_year);
	}
	
	public void print()
	{
		System.out.print("Im a magazine!, my publication year is " + publication_year);
	}
}
