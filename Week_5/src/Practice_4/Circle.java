package Practice_4;

public class Circle extends Shape{
	public Circle(int position, Color color)
	{
		super(position, color);
	}
	
	public void draw()
	{
		System.out.println("O");
	}
	
	@Override
	public String toString()
	{
		return "Circle figure " + color;
	}

}
