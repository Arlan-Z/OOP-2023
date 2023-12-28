package Task_2;

public class Cat implements Moveable, Standable{
	public String name;
	public Cat()
	{
		
	}
	
	public Cat(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public void move() {
		System.out.println("Meow meow i am moving");
		
	}

	@Override
	public void stand() {
		System.out.println("Meow meow i am standing");
		
	}
}
