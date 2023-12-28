package Practice_1;

public class Person {
	String name;
	int age;
	private int money = 0;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void changeMoney(int Money)
	{
		this.money += Money;
	}
	public String toString()
	{
		return name + " " + age + " " + money + "$";
	}
}
