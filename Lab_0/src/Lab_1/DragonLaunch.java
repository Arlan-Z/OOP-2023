package Lab_1;

import java.util.Vector;

public class DragonLaunch {
	
	static Vector<Person> people = new Vector<Person>();
	
	private static void kidnap(Person person)
	{
		people.add(person);
		
	}
	
	private static boolean willDragonEat()
	{
		//System.out.println("size: " + people.size());
		for(int i = 0; i < people.size() - 1; i ++)
		{
			if(people.elementAt(i).gender != people.elementAt(i + 1).gender && people.elementAt(i).gender == Gender.MALE)
			{
				people.remove(i);
				people.remove(i);
				i = 0;
			}
			
		}
		//System.out.println("size: " + people.size());
		if(!people.isEmpty()) 
			{
			people.clear();
			return true;
			}
		else return false;
	}
	
	public static void main(String[] args) {
		
		Person Oleg = new Person(Gender.MALE, "Oleg");
		Person Pasha = new Person(Gender.MALE, "Pasha");
		Person Kristina = new Person(Gender.FEMALE, "Kristina");
		Person Natasha = new Person(Gender.FEMALE, "Natasha");
		Person Igor = new Person(Gender.MALE, "Igor");
		
		kidnap(Oleg);
		kidnap(Pasha);
		kidnap(Kristina);
		kidnap(Natasha);
		kidnap(Igor);
		
		if(willDragonEat()) System.out.println("It will eat");
		else System.out.println("It wont eat");
		
	}

}
