package Task_1;

public class Book extends LibraryItem{
	
	String author;
	
	public Book(int price, String name, int publication_year, String author)
	{
		super(price, name, publication_year);
		this.author = author;
	}
	
	public void print()
	{
		System.out.print("Im a book!, my price is " + price +" and my author is " + author);
	}

}
