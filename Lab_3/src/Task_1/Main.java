package Task_1;


public class Main {

	public static void main(String[] args) {
		Duck steve = new Duck("Steve", 2, 3);
		Squirrel bill = new Squirrel("Bill", 3, 5);
		
		steve.attack(bill);
		bill.heal();
		System.out.println(bill);
		System.out.println(steve);
	}

}
