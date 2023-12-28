package Task_1;

public interface Heal {
	public default void heal()
	{
		System.out.println("I can`t heal");
	}
}
