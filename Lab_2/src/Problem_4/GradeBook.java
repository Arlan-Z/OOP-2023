package Problem_4;
import Practice_2.Student;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GradeBook {
	public static Map<Student, Integer> Students = new HashMap<Student, Integer>();
	Course course;
	
	private int id = 1;
	private int yearOfStudy = 2023;
	
	public GradeBook(String name, String description, int credits, String prerequisites)
	{
		course = new Course(name, description, credits, prerequisites);
	}
	
	public void displayMessage()
	{
		System.out.println("Welcome to the grade book for " + course.getName() +"!");
		
	}
	
	public void displayGradeReport()
	{
		if(Students.isEmpty())
		{
			System.out.println("There are no students");
			return;
		}
		
		for(Entry<Student, Integer> student: Students.entrySet())
		{
			System.out.println("Student  " + student.getKey().getName() + ": " + student.getValue());

		}
		
		determineClassAverage();
		outputBarChart();
		
	}
	
	
	private void outputBarChart()
	{
		int min = 0;
		int max = 9;
		while(max <= 100)
		{
			System.out.print(new DecimalFormat("00").format(min) + " - " + new DecimalFormat("00").format(max) + ": ");
			for(Entry<Student, Integer> student: Students.entrySet())
			{
				if(student.getValue() <= max && student.getValue() >= min)
				{
					System.out.print("*");
				}
				else continue;
			}
			System.out.print("\n");
			min += 10;
			max += 10;
		}
		max = 100;
		System.out.print(max + ": ");
		for(Entry<Student, Integer> student: Students.entrySet())
		{
			if(student.getValue() == max)
			{
				System.out.print("*");
			}
			else continue;
		}
	}
	
	private void determineClassAverage()
	{
		int gradeSum = 0;
		int gradeCount = 0;
		double gradeAverage = 0.0;
		
		int gradeMax = 0;
		Student studentWithMaxGrade = null;
		
		int gradeMin = 101;
		Student studentWithMinGrade = null;
		for(Entry<Student, Integer> student: Students.entrySet())
		{
			if(gradeMax < student.getValue()) 
			{
				gradeMax = student.getValue();
				studentWithMaxGrade = student.getKey();			
			}
			
			if(gradeMin > student.getValue())
			{
				gradeMin = student.getValue();
				studentWithMinGrade = student.getKey();
			}
			
			gradeSum += student.getValue();
			gradeCount ++;
		}
		gradeAverage = gradeSum / gradeCount;
		System.out.println("Class average is " + gradeAverage + " Lowest grade is: " + gradeMin + " (Student " + studentWithMinGrade.getName() + ", id: " + studentWithMinGrade.getId() + ").");
		System.out.println("Highest grade is " + gradeMax + " (Student " + studentWithMaxGrade.getName() + ", id: " + studentWithMaxGrade.getId() + ").");
		
	}
	
	public void addStudent(String name, int grade)
	{
		Student student = new Student(name, id, yearOfStudy);
		Students.put(student, grade);
		id++;
	}
	
	
	public String toString()
	{
		return course.toString();
	}
}
