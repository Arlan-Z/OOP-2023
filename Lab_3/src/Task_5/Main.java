package Task_5;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import Task_4.Employee;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Chocolate twix = new Chocolate("Twix", 20.0);
		Chocolate snickers = new Chocolate("Snickers", 15.2);
		Chocolate kitkat = new Chocolate("Kit Kat", 19);
		Chocolate kinder = new Chocolate("Kinder", 15);
		Chocolate nesquik = new Chocolate("Nesquik", 22.9);
		Chocolate nuts = new Chocolate("Nuts", 5.9);
		Chocolate snatch = new Chocolate("Snatch", 1.5);
		Chocolate mars = new Chocolate("Mars", 8.4);
		Chocolate temp = new Chocolate("Temp", 36.6);
		Chocolate bober = new Chocolate("Bober", 50.9);
		
		
		
		Chocolate[] meals = new Chocolate[10];
		meals[0] = twix;
		meals[1] = snickers;
		meals[2] = kitkat;
		meals[3] = kinder;
		meals[4] = nesquik;
		meals[5] = nuts;
		meals[6] = snatch;
		meals[7] = mars;
		meals[8] = temp;
		meals[9] = bober;
//		System.out.print("Before: ");
//		for(Chocolate c: meals)
//		{
//			System.out.print(c.weight + " ");
//		}
//		System.out.println("");
//		
//		Sort.quickSort(meals, 0, meals.length - 1);
////		Sort.bubbleSort(meals);
//		
//		
//		System.out.print("After: ");
//		for(Chocolate c: meals)
//		{
//			System.out.print(c.weight + " ");
//		}
		
		
		Time KZ = new Time(22, 34, 56);
		Time US = new Time(12, 45, 23);
		Time AR = new Time(23, 55, 45);
		Time UA = new Time(11, 45, 23);
		Time PG = new Time(14, 33, 27);
		
		Time[] Time = new Time[5];
		Time[0] = KZ;
		Time[1]= US;
		Time[2] = AR;
		Time[3] = UA;
		Time[4] = PG;
		
//		Sort.bubbleSort(Time);
//		Sort.quickSort(Time, 0, Time.length - 1);
		
		
//		
//		for(Time t : Time)
//		{
//			System.out.println(t);
//		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Employee david = new Employee("David",dateFormat.parse("20-11-2023"), 2000.0, "904-394-934");
		Employee steve = new Employee("Steve",dateFormat.parse("21-09-2022"), 2500.0, "345-333-234");
		Employee milana = new Employee("Milana",dateFormat.parse("27-01-2022"), 2900.0, "534-345-098");
		Employee arlan = new Employee("Arlan",dateFormat.parse("01-01-2020"), 2100.0, "271-204-013");
		Employee anton = new Employee("Anton",dateFormat.parse("11-11-2021"), 2600.0, "345-234-113");
		
		
		Employee workers[] = new Employee[5];
		
		workers[0] = david;
		workers[1] = steve;
		workers[2] = milana;
		workers[3] = arlan;
		workers[4] = anton;
		
		Sort.bubbleSort(workers);
//		Sort.quickSort(workers, 0, workers.length - 1); // Sorting by salary
		
		for(Employee e: workers)
		{
			System.out.println(e.name + " " + e.getSalary() + "$");
		}
	}

}

