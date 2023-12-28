package Practice_1;

public class Class_Flower {
	
	String smell;
	String color;
	int height;
		
	
	public Class_Flower(String smell, String color, int height)
	{
		this.smell = smell;
		this.color = color;
		this.height = height;
		
	}
	
	
	
	public String toString()
	{
		return smell + " " + color;
	}
}
