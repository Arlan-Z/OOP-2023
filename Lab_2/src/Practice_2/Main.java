package Practice_2;

public class Main {

	public static void main(String[] args) {
		
		// 1 problem
		Student Arlan = new Student("Arlan", 4072024, 2022);
		
		System.out.println(Arlan.getName() + " " + Arlan.getId() + " " + Arlan.getYearOfStudy());
		
		// 2 problem
		Set_Triangle small = new Set_Triangle(3);
		System.out.println(small.toString());
		
		// 3 problem
		Time KzTime = new Time(17, 14, 55);
		
		System.out.println(KzTime.toStandard());
		System.out.println(KzTime.toUniversal());
		
		// Class problem
		TrianglePositioned leftTriangle = new TrianglePositioned(3, "LEFT");
		TrianglePositioned rightTriangle = new TrianglePositioned(3, "RIGHT");
		TrianglePositioned centerTriangle = new TrianglePositioned(3, "CENTER");
		
		System.out.println(leftTriangle.toString());
		System.out.println(rightTriangle.toString());
		System.out.println(centerTriangle.toString());
		
	}

}
