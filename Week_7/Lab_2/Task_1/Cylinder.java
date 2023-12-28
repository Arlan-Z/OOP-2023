package Task_1;

public class Cylinder extends Shape {
	int radius;
	int height;
	public Cylinder(int radius, int height)
	{
		this.height = height;
		this.radius = radius;
	}
	
	public double getPerimeter()
	{
		return 2 *radius * height;
	}
	
	public double getArea()
	{
		return 2 * 3.14 * radius + 2 * 3.14 * radius * height;
	}
	
	public double getVolume()
	{
		return 4 * 3.14 * radius * radius * height;
	}
}
