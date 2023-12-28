package Practice_6;

public interface CanHavePizza {
	public int pizzaCount = 20;
	public void eatPizza();
	public default void remainPizza()
	{
		System.out.println(pizzaCount);
	}
}
