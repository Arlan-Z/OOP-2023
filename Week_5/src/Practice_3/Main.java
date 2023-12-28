package Practice_3;

public class Main {

	public static void main(String[] args) {
		
		// problem 1
		Cat Mursik = new Cat("Mursik");
		
		Mursik.attack();
		Mursik.attack(2);
		
		// problem 2
		Student Arlan = new Student("Arlan", "Chekov street", "FIT IS", 2022, 2500.00);
		
		System.out.println(Arlan.toString());
		
	}

}
