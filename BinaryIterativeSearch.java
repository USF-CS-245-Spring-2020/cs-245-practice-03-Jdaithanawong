
public class BinaryIterativeSearch implements Practice03Search{

	public int search(int [] arr, int target) {
		int first = 0;
        int last = arr.length - 1;
        while(first <= last)
        {
        	int middle = (first + last) / 2;
        	if(arr[middle] == target)
        	{
        		return middle;
        	}
        	else if(arr[middle] < target)
        	{
        		first = middle + 1;
        	} 
        	else
        	{
        		last = middle - 1;
        	}
        }
		return -1;
	}
}
