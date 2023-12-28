package Practice_6;

public interface Swimmable {
	public void swim();
	
	public default void isSwimmable()
	{
		System.out.println("Yes, I can Swim");
	}
}
