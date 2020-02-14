
public class SelectionSort implements Practice03Sort{
	
	public void sort(int [] arr) {
       
        for (int i = 0; i < arr.length-1; i++)
        {
            int firstIndex = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[firstIndex])
                {
                    firstIndex = j;
                }
            }

            int temp = arr[firstIndex];
            arr[firstIndex] = arr[i];
            arr[i] = temp;
        }
	}

}
