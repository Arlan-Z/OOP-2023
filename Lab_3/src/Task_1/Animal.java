package Task_1;

public abstract class Animal {
	
	public String name;
	public int health;
	public int damage;
	
	public Animal()
	{
		
	}
	
	public Animal(String name, int health, int damage)
	{
		this.health = health;
		this.damage = damage;
		this.name = name;
	}
	
	
	public void dead()
	{
		System.out.println(name + " is dead");
	}
	
	public String toString()
	{
		return name + " " + health + " " + damage;
	}
	

	
}
