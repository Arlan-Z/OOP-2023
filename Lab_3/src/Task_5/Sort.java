package Task_5;

public abstract class Sort {
	
	private static <E> void swap(E [] array, int first, int second)
	{
		E buf = array[first];
		array[first] = array[second];
		array[second] = buf;
		
	}
	
	public static <E extends Comparable <E>> void bubbleSort(E [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			boolean isSwapped = false;
			for(int j = 0; j < array.length - 1; j++)
			{
				if(array[j].compareTo(array[j + 1]) > 0)
				{
					swap(array, j, j + 1);
					isSwapped = true;
				}
				
				
			}
			if(!isSwapped) break;
		}
	}
	
	public static <E extends Comparable<E>> void quickSort(E [] array, int low, int high)
	{
		if(low >= high) return;
		
		int left = low;
		E pivot = array[high];
		
		for(int i = low; i < high; i++)
		{
			if(array[i].compareTo(pivot) < 0)
			{
				swap(array, left, i);
				left++;
			}
			
		}
		swap(array, left, high);
		
		quickSort(array, low, left - 1);
		quickSort(array, left + 1, high);
		
	}
	
}
