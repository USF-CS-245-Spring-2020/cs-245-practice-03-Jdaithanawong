
public class BinaryRecursiveSearch implements Practice03Search{
	
	public int search(int [] arr, int target) {
		return BinaryRecursive(arr, 0, arr.length - 1, target);
	}

	public int BinaryRecursive(int [] arr, int first, int last, int target){
		if(last >= first)
		{
			int middle = first + (last - first) / 2;
			if(arr[middle] == target)
			{
				return middle;
			}
			else if(arr[middle] > target)
			{
				return BinaryRecursive(arr, first, middle-1, target);
			}
			else
			{
				return BinaryRecursive(arr, middle+1, last, target);
			}
		}
		return -1;
	}
}
