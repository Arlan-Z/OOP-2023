package Task_3;

public class Main {

	public static void main(String[] args) {
		List spisok = new List();
		spisok.add("Hello");
		spisok.add("my");
		spisok.add("name");
		spisok.add("is");
		spisok.add("Arlan");
		
		spisok.size();
		
		for(String o: spisok.list)
		{
			System.out.print(o + " ");
		}
		System.out.println();
		
		spisok.delete("my");
		spisok.delete("name");
		spisok.delete("is");
		
		spisok.size();
		
		for(String o: spisok.list)
		{
			System.out.print(o + " ");
		}
		System.out.println();
		
		spisok.clear();
		spisok.size();
		
		
	}

}
