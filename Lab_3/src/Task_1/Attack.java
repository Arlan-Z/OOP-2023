package Task_1;

public interface Attack {
	public default void attack(Animal O)
	{
		System.out.println("I can`t attack");
	}
}
