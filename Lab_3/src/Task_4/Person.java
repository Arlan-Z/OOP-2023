package Task_4;

public class Person {
	public String name;
	
	public Person()
	{
		
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	@Override
	public boolean equals(Object O)
	{
		if(!(O instanceof Person)) return false;
		Person p = (Person) O;
		return p.name == this.name;
	}
	
}
