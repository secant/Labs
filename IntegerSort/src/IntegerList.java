/**
 * IntegerList.java
 * Vivian Fang, period 1
 * A class that creates an array of integers. There are functions
 * that allow the user to randomize, sort, search, and replace
 * integers in the list.
 */
public class IntegerList
{
	int[] list; //values in the list
	//------------------------------------------------------- 
	//create a list of the given size 
	//------------------------------------------------------- 
	public IntegerList(int size)
	{
	      list = new int[size];
	}
	//------------------------------------------------------- 
	//fill array with integers between 1 and 100, inclusive 
	//------------------------------------------------------- 
	public void randomize()
	{
		for (int i=0; i<list.length; i++)
			list[i] = (int)(Math.random() * 100) + 1; 
	}
	//------------------------------------------------------- 
	//print array elements with indices 
	//------------------------------------------------------- 
	public void print()
	{
		for (int i=0; i<list.length; i++)
			System.out.println(i + ":\t" + list[i]); 
	}
	//------------------------------------------------------- 
	//return the index of the first occurrence of target in the list. 
	//return -1 if target does not appear in the list 
	//-------------------------------------------------------
	public int search(int target)
	{
		int location = -1;
		for (int i=0; i<list.length && location == -1; i++)
			if (list[i] == target)
	            location = i;
		return location;
	}
	//-------------------------------------------------------
	//sort the list into ascending order using the selection sort algorithm 
	//-------------------------------------------------------
	public void selectionSort()
	{
		int minIndex;
		for (int i=0; i < list.length-1; i++)
		{
			//find smallest element in list starting at location i 
			minIndex = i;
			for (int j = i+1; j < list.length; j++)
			if (list[j] < list[minIndex]) minIndex = j;
			//swap list[i] with smallest element
			int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
		} 
	}
	//-------------------------------------------------------
	//replace the first item on the list with a new value
	//-------------------------------------------------------
	public void replace(int oldVal, int newVal)
	{
		int location = 0;
		int i = 0;
		while(location == 0 && i < list.length)
		{
			if(list[i] == oldVal)
			{
				location = i;
			}
			i++;
		}
		if(list[location] == oldVal)
			list[location] = newVal;
		else
			System.out.println("No replacements were made.");
	}
	//-------------------------------------------------------
	//replace all old values with a new value
	//-------------------------------------------------------
	public void replaceAll(int oldVal, int newVal)
	{
		int count = 0;
		for(int i = 0; i < list.length -1; i++)
		{
			if (list[i] == oldVal)
			{
				list[i] = newVal;
				count++;
			}
		}
		if(count == 0)
			System.out.println("No replacements were made.");
	}
	//-------------------------------------------------------
	//perform a selection sort in decreasing order
	//-------------------------------------------------------
	public void sortDecreasing()
	{
		int maxIndex;
		for (int i=0; i < list.length-1; i++)
		{
			//find largest element in list starting at location i 
			maxIndex = i;
			for (int j = i+1; j < list.length; j++)
				if (list[j] > list[maxIndex]) 
					maxIndex = j;
			//swap list[i] with largest element
			int temp = list[i];
            list[i] = list[maxIndex];
            list[maxIndex] = temp;
		} 
	}
	//-------------------------------------------------------
	//perform a binary sort. if the value is not found, -1 is returned
	//-------------------------------------------------------
	public int binarySearchD(int target)
	{
		int min = 0;
		int max = list.length - 1;
		int mid = (min + max) / 2;
		while(min <= max && list[mid] != target)
		{
			if(list[mid] > target)
				min = mid + 1;
			else
				max = mid - 1;
			mid = (min + max) / 2;
		}
		if(min > max)
			return -1;
		return mid;
	}
}