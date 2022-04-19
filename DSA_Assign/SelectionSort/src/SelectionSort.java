
public class SelectionSort {

	public static void selection(int []arr)
	{
		for(int p=0; p<arr.length-1; p++)
		{
			int i=p;
			int x = arr[i];

			while(i<arr.length)
			{
				if(arr[i] < x)
				{
					int tmp = arr[i];
					arr[i] = x;
					x = tmp;
				}
				i++;
			}
			arr[p] = x;
		}		
	}

	public static void insertion(int []arr1) {

		for(int j=1;j<arr1.length;j++)
		{
			int i=j;
			while(i>0) {
				if(arr1[i]<arr1[i-1])
				{
					int temp=arr1[i];
					arr1[i]=arr1[i-1];
					arr1[i-1]=temp;
					i--;
				}
				else break;
			}

		}
	}
	public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}
}

