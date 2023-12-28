package Practice_4;

public class Triangle extends Shape{
	public Triangle(int position, Color color)
	{
		super(position, color);
	}
	
	public void draw()
	{
		System.out.println("|>");
	}
	
	@Override
	public String toString()
	{
		return "Triangle figure " + color;
	}
}
