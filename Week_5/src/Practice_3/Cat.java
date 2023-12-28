package Practice_3;

public class Cat extends Animal {
	String type;
	
	public Cat(String name, String type, int dangerLevel)
	{
		super(name, "Cat", dangerLevel);
		this.type = type + " " + super.species;
	}
	
	public Cat(String name, String type)
	{
		super(name, "Cat", 0);
		this.type = type + " " + super.species;
	}
	
	public Cat(String name)
	{
		super(name, "Cat", 0);
		this.type = "wild"+ " " + super.species;
	}
	
	@Override
	public String toString()
	{
		return name + " " + type;
	}
	
	@Override
	public void attack()
	{
		System.out.println(type + " " + name + " attacked and dealed 0 dmg");
	}
	
	public void attack(int damage)
	{
		System.out.println(type + " " + name + " attacked and dealed " + damage + " dmg");
	}
	
}
