package Task_5;

public class Chocolate implements Comparable<Chocolate>{
	public String name;
	public double weight;
	
	public Chocolate() {}
	
	public Chocolate(String name, double weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public String toString()
	{
		return name + " " + weight + "g";
	}

	@Override
	public int compareTo(Chocolate c) {
		int val = this.weight > c.weight ? 1 : -1;
		return val;
	}


}
