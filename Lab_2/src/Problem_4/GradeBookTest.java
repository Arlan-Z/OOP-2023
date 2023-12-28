package Problem_4;
import java.util.Map.Entry;
import java.util.Scanner;

import Practice_2.Student;

public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook GradeBookOOP = new GradeBook("Object - oriented Programming and Design", "KBTU Discipline", 5, "PP1 and PP2");
		
		GradeBookOOP.displayMessage();
		
		GradeBookOOP.addStudent("Danyal", 50);
		GradeBookOOP.addStudent("Arlan", 70);
		GradeBookOOP.addStudent("Amanzhol", 90);
		GradeBookOOP.addStudent("Aral", 80);
		GradeBookOOP.addStudent("Ilyas", 100);
		GradeBookOOP.addStudent("Bekarys", 80);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input grades for your students");
		for(Entry<Student, Integer> student: GradeBook.Students.entrySet())
		{
			System.out.print(student.getKey().getName() + " ");
			int grade = in.nextInt();
			student.setValue(grade);
			//System.out.print("\n");
		}
		
		in.close();
		
		GradeBookOOP.displayGradeReport();
		
	}

}
