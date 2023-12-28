package Task_4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
	
	public Manager()
	{
		
	}
	
	private Vector<Employee> workers = new Vector<Employee>();
	private double bonus;
	private double bonusSalary;
	
	public Manager(String name, Date hireDate, double salary, String insuranceNumber, double bonus) {
		super(name, hireDate, salary, insuranceNumber);
		this.bonus = bonus;
	}
	
	public void addWorker(Employee e)
	{
		workers.add(e);
		bonusSalary = workers.size() * bonus;
	}
	
	public void deleteWorker(Employee e)
	{
		workers.remove(e);
		bonusSalary = workers.size() * bonus;
	}
	
	public void showWorkers()
	{
		if(workers.isEmpty()) 
		{
			System.out.println("There are no " + name +"`s workers");
			return;
		}
		for(Employee e: workers)
		{
			System.out.println(e);
		}
	}
	
	@Override
	public double getSalary()
	{
		return super.getSalary() + bonusSalary;
	}
	
	@Override
	public String toString()
	{
		return "Name " + name + " Salary: " + getSalary() + "$ " + " Hire date: " + getHireDate() + " Insurance number: " + insuranceNumber;
	}
	
	@Override
	public boolean equals(Object O)
	{
		if(!(O instanceof Manager)) return false;
		Manager M = (Manager) O;
		return M.name == this.name && M.getHireDate() == this.getHireDate() && this.workers.equals(M.workers);
	}
}
	

