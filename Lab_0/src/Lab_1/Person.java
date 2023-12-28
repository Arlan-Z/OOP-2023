package Lab_1;

public class Person {
	public Gender gender;
	public String name;
	
	public Person(Gender gender, String name)
	{
		this.gender = gender;
		this.name = name;
	}
	
	
	public String toString()
	{
		return name + " " + gender;
	}
}
