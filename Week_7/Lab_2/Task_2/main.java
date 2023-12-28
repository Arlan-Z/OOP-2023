package Task_2;
import java.util.HashSet;


public class main {

	public static void main(String[] args) {
		Cat Asa = new Cat("Asa", 4, 10);
		Cat Mursik = new Cat("Mursik", 4, 10);
		Cat MursikCopy = new Cat("Mursik", 8, 1);
		System.out.println(Mursik == Asa);
		System.out.println(Mursik.equals(MursikCopy));
	
	
	HashSet<Animal> Animals = new HashSet<>();
	
	Animal Dog = new Animal("Dog", 5, 8);
	Animal Cat = new Animal("Mutsik", 4, 9);
	Animal DogCopy = new Animal("Dog", 2, 7);
	
	Animals.add(DogCopy);
	Animals.add(Dog);
	Animals.add(Cat);
	Animals.add(Mursik);
	Animals.add(MursikCopy);
	Animals.add(Asa);
	
	for(Animal animal : Animals)
	{
		System.out.println(animal.toString());
	}
	}
	
}
