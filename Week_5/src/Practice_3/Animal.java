package Practice_3;

public class Animal {
	String name;
	String species;
	int dangerLevel;
	
	public Animal(String name, String species, int dangerLevel)
	{
		this.name = name;
		this.species = species;
		this.dangerLevel = dangerLevel;
	}
	
	public Animal(String name)
	{
		this.name = name;
		this.species = "Unknown";
		this.dangerLevel = 0;
	}
	
	public void attack()
	{
		System.out.println("There are no attack function");
		
	}
	
	
	
	public String toString()
	{
		return name + " " + species + " " + dangerLevel;
	}
	
	
}
