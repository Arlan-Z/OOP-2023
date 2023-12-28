package Practice_6;

public class Duck implements Swimmable{
		public String name;
		
		
		public Duck()
		{
			name = null;
		}
		public Duck(String name)
		{
			this.name = name;
		}
		
		@Override
		public void swim()
		{
			System.out.println(name + " is swimming");
		}
		
		public String toString()
		{
			return "Duck " + name;
		}

		
}
