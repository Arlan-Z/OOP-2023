package Practice_6;

public class Main {

	public static void main(String[] args) {
		Duck Michael = new Duck("Michael");
		Michael.isSwimmable();
		Michael.swim();
		
		Cat Michelle = new Cat("Michelle");
		Michelle.eatPizza();
		Michelle.remainPizza();
		
		Student Karim = new Student("Karim");
		Karim.eatPizza();
		Karim.remainPizza();
		Karim.isSwimmable();
		Karim.swim();
		
		Pizzeria Mongol = new Pizzeria("Mongol");
		Mongol.BuyPizza(Karim);

	}

}
