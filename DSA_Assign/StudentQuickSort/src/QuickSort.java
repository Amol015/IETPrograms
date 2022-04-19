
public class QuickSort {
	
	public static void quickSort(Student arr[], int low , int high)
	{
		if (low<high)
		{
			int pi = partition(arr ,low, high);
			quickSort(arr , low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	
	private static int partition (Student[] arr, int l, int h)
	{
		int p =h;
		int j=l;
		int i=l-1;
		
		while(j != p)
		{
			if(arr[j].getAge() < arr[p].getAge())
			{
				i++;
				Student temp =arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		i++;
		Student temp =arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return i;
	}

	public static void print(Student [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\n ");
		}
		System.out.println();		
	}
}
