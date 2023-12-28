package Practice_4;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Shape> Figures = new Vector<Shape>();
		Circle circle = new Circle(5, Color.BLUE);
		Triangle triangle = new Triangle(4, Color.RED);
		Rectangle rectangle = new Rectangle(7, Color.YELLOW);
		
		Figures.add(rectangle);
		Figures.add(triangle);
		Figures.add(circle);
		for(Shape S : Figures)
		{
			S.draw();
		}
		
		for(Shape S : Figures)
		{
			System.out.println(S.toString());
		}
	}

}
