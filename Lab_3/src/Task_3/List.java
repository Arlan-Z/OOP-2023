package Task_3;

import java.util.ArrayList;

public class List implements MyCollection<String>{
	public ArrayList<String> list = new ArrayList<>();
	
	public List()
	{
		
	}

	@Override
	public void size() {
		System.out.println(list.size());
		
	}

	@Override
	public void clear() {
		list.clear();
		
	}

	@Override
	public void add(String element) {
		list.add(element);
		
	}

	@Override
	public void delete(String element) {
		list.remove(element);
		
	}
	
}
