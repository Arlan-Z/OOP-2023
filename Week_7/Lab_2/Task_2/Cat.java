package Task_2;

public class Cat extends Animal{
	int lives = 9;
	private String type = "Cat";
	public Cat(String name, int attack, int health)
	{
		super(name, attack, health);
	}
	
	public void takeDamage(int damage)
	{
		System.out.println("Received " + damage);
		health = health - damage;
		if(health <= 0 && lives <= 0) super.dead();
		else 
			{
				health = 2;
				lives -= 1;
			}
	}
	
	@Override
	public String toString()
	{
		if(isDead) return name + " STATUS: DEAD";
		return name + " || ATK " + attack +  " || HP " + health + " |+| LIVES LEFT " + lives;
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
	
	@Override
	public int hashCode()
	{
		int result = 31 +(name != null ? name.hashCode() : 0);
		result = 31 * result + (type != null ? name.hashCode() : 0);
		return result;
	}
	

}
