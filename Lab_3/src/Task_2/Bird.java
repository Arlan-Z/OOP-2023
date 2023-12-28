package Task_2;

public class Bird implements Flyable{
	
	public String name;
	public Bird()
	{
		
	}
	
	public Bird(String name)
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
		System.out.println("Chi chi rik i am moving");
		
	}

	@Override
	public void stand() {
		System.out.println("Chi chi rik i am standing");
		
	}

	@Override
	public void fly() {
		System.out.println("Chi chi rik i am flying");
		
	}


	
}
