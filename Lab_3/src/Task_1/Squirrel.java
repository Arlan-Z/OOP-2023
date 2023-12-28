package Task_1;

public class Squirrel extends Animal implements Heal{
	private int healPoints = 2;
	
	public Squirrel()
	{
		
	}
	
	public Squirrel(String name, int health, int damage)
	{
		super(name, health, 0);
	}
	@Override
	public void heal() {
		this.health += healPoints;
		
	}
	

}
