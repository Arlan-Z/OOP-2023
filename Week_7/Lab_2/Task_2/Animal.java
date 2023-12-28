package Task_2;

public class Animal {
	public String name;
	public int attack;
	public int health;
	
	protected boolean isDead = false;
	
	public Animal(String name, int attack, int health)
	{
		this.name = name;
		this.attack = attack;
		this.health = health;
	}
	
	public void attack()
	{
		if(isDead) dead();
		System.out.println("Dealed " + attack);
	}
	
	public void takeDamage(int damage)
	{
		System.out.println("Received " + damage);
		health = health - damage;
		if(health <= 0) dead();
	}
	
	protected void dead()
	{
		System.out.println(name + " is dead");
		isDead = true;
	}
	
	public String toString()
	{
		if(isDead) return name + " STATUS: DEAD";
		return name + " || ATK " + attack +  " || HP " + health;
	}
	
	@Override
	public boolean equals(Object creature)
	{
		if(this == creature) return true;
		if(creature == null || getClass() != creature.getClass()) return false;
		
		Animal animal = (Animal) creature;
		if(this.name == animal.name) return true;
		return false;
		
	}
	
	public int hashCode()
	{
		int result = 31 +(name != null ? name.hashCode() : 0);
		return result;
	}
	
}
