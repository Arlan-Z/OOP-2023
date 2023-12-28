package Task_4;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	private Date hireDate = new Date();
	private double salary;
	public String insuranceNumber;
	
	public Employee()
	{
		
	}
	public Employee(String name, Date hireDate, double salary, String insuranceNumber)
	{
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public Date getHireDate()
	{
		return hireDate;
		
	}
	
	public void setHireDate(Date hireDate)
	{
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString()
	{
		return "Name " + name + " Salary: " + getSalary() + "$ " + " Hire date: " + getHireDate() + " Insurance number: " + insuranceNumber;
	}
	
	@Override
	public boolean equals(Object O)
	{
		if(!(O instanceof Employee)) return false;
		Employee e = (Employee) O;
		return e.name == this.name && e.hireDate == this.hireDate;
	}
	
	@Override
	public int compareTo(Employee o) {
		return (int) (this.getSalary() - o.getSalary());
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
