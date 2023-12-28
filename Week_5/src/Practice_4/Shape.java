package Practice_4;

public abstract class Shape {
	int position;
	Color color;
	public Shape(int position, Color color)
	{
		this.position = position;
		this.color = color;
	}
	
	public abstract void draw();
	public String toString()
	{
		return "NULL figure, " + color;
	}
}
