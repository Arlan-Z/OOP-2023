package Practice_4;

public class Rectangle extends Shape{
	public Rectangle(int position, Color color)
	{
		super(position, color);
	}
	
	@Override
	public void draw()
	{
		System.out.println("[]");
	}
	
	@Override
	public String toString()
	{
		return "Rectangle figure " + color;
	}

}
