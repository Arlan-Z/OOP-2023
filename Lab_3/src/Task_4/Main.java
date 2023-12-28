package Task_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Employee david = new Employee("David",dateFormat.parse("20-11-2023"), 2000.0, "904-394-934");
		Employee steve = new Employee("Steve",dateFormat.parse("21-09-2022"), 2500.0, "345-333-234");
		Employee milana = new Employee("Milana",dateFormat.parse("27-01-2022"), 2900.0, "534-345-098");
		Employee arlan = new Employee("Arlan",dateFormat.parse("01-01-2020"), 2100.0, "271-204-013");
		
		Employee milana_copy = new Employee("Milana",dateFormat.parse("27-01-2022"), 2200.0, "123-345-568");
		Employee steve_copy = (Employee)steve.clone();
		
		Manager Kyle = new Manager("Kyle",dateFormat.parse("27-05-2020"), 2900.0, "534-345-098", 200.0);
		Manager Irina = new Manager("Irina",dateFormat.parse("10-11-2021"), 2900.0, "334-325-118", 100.0);
		
		Manager Kyle_copy = (Manager) Kyle.clone();
		
		
		Kyle.addWorker(david);
		Kyle.addWorker(steve);
		Kyle.addWorker(milana);
//		Kyle.addWorker(milana_copy);
//		Kyle.showWorkers();
//		
//		
////		Set<Employee> set = new TreeSet<Employee>(new CompareEmployeeByName());
//		Set<Employee> set = new TreeSet<Employee>(new CompareEmployeeByHireDate());
////		Set<Employee> set = new TreeSet<Employee>();
//		set.add(steve);
//		set.add(milana);
//		set.add(milana_copy);
//		set.add(david);
//		set.add(arlan);
//		
//		set.add(Kyle);
//		set.add(Irina);
//		
//		for(Employee e: set) System.out.println(e.name + " " + e.getSalary() + " " + e.getHireDate());
		
//		System.out.println("Before " + steve);
//		
//		steve.name = "Changed_Steve";
////		steve.setHireDate(dateFormat.parse("20-11-2023"));
////		steve.setSalary(1000.0);
////		steve.hireDate = dateFormat.parse("20-11-2023");
//		
//		System.out.println("Copy after changes " + steve_copy);
//		System.out.println("Changed to" + steve);
//		System.out.println(steve == steve_copy);
//		
//		System.out.println(Kyle == Kyle_copy);
		Kyle.showWorkers();
		Kyle.deleteWorker(david);
		Kyle.deleteWorker(steve);
		Kyle.deleteWorker(milana);
		
	
		Kyle_copy.showWorkers();
//		System.out.println(Kyle.equals(Kyle_copy));
		
		

	}

}
