package Practice_6;

public class Student implements CanHavePizza, Swimmable {
		public String name;
		public int remainPizza = CanHavePizza.pizzaCount;
		
		public Student()
		{
			name = null;
		}
				
		public Student(String name)
		{
			this.name = name;
		}
		
		@Override
		public void eatPizza() {
			System.out.println("Om nom nom pizzaaaaa....");
			remainPizza --;
			
		}
		
		@Override
		public void remainPizza()
		{
			System.out.println(remainPizza);
		}
		
		
		public String toString()
		{
			return this.getClass() + " " + name;
		}

		@Override
		public void swim() {
			System.out.println("I can swim!!!! YEEEESSSSS");
			
		}
}
