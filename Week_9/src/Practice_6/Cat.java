package Practice_6;

public class Cat implements CanHavePizza{
	public String name;
	private int remainPizza = pizzaCount;
	
	
	public Cat()
	{
		name = null;
	}
	
	public Cat(String name)
	{
		this.name = name;
	}

	@Override
	public void eatPizza() {
		System.out.println("Ps ps ps pizzaaaaa....");
		remainPizza --;
		
	}
	
	@Override
	public void remainPizza()
	{
		System.out.println(remainPizza);
	}
	public String toString()
	{
		return "Cat " + name;
	}
	

}
