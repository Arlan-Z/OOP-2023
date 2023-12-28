package Task_1;

public class Sphere extends Shape{
	int radius;
	
	public Sphere(int radius)
	{
		
		this.radius = radius;
	}
	
	public double getPerimeter()
	{
		return 2 * 3.14 * radius;
	}
	
	public double getArea()
	{
		return 4 * 3.14 * radius * radius;
	}
	
	public double getVolume()
	{
		return (4 / 3) * 3.14 * Math.pow(radius, 3);
	}
}
