package Task_1;

public class Duck extends Animal implements Attack{

	public Duck()
	{
		
	}
	
	public Duck(String name, int health, int damage)
	{
		super(name, health, damage);
	}
	
	@Override
	public void attack(Animal O) {
		System.out.println(name + " attacked " + O.name);
		O.health -= this.damage;
	}

	
	
}
