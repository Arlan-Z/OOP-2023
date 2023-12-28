package Task_1;

public abstract class LibraryItem {
	
	public int price;
	public String name;
	public int publication_year;
	
	public LibraryItem(int price, String name, int publication_year)
	{
		this.price = price;
		this.name = name;
		this.publication_year = publication_year;
	}
	
	
}
