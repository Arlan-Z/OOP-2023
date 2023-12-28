package Practice_6;

public class Pizzeria {
	public String name;
	private int budget = 6000;
	
	public Pizzeria()
	{
		this.name = null;
	}
	
	public Pizzeria(String name)
	{
		this.name = name;
	}
	
	public void BuyPizza(Object o)
	{
		if(o instanceof Student)
		{
			Student object = (Student) o;
			object.remainPizza++;
			budget += 500;
			System.out.println("Thanks for purchase! " + object.name +" now you have " + object.remainPizza + " pizzas");
			return;
		
		}
		else
		{
			System.out.println("Creatures like doesnt eat pizza!");
		}
	}
	
	public String toString()
	{
		return this.getClass() + " " + name + " budget: " + budget;
	}
}
