package Task_1;

public class Cube extends Shape{
	int length;
	public Cube(int length)
	{
		this.length = length;
	}
	
	public double getPerimeter()
	{
		return 4 * length;
	}
	
	public double getArea()
	{
		return length * length * 6;
	}
	
	public double getVolume()
	{
		return Math.pow(length, 3);
	}
}
