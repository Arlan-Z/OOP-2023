package Problem_4;

public class Course {
	
	public String courseName;
	
	private String description;
	private int credits;
	private String prerequisites;
	
	public Course(String name, String description, int credits, String prerequisites)
	{
		courseName = name;
		this.description = description;
		this.credits = credits;
		this.description = description;
	}
	
	public String getName()
	{
		return courseName;
	}
	
	public String toString()
	{
		return courseName + " " + description + " " + credits + " " + prerequisites;
	}
	
}
