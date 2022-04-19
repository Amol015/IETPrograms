
public class QuickMergeSort {

	public static void quickSort(int arr[], int low , int high)
	{
		if (low<high)
		{
			int pi = partition(arr ,low, high);
			quickSort(arr , low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	private static int partition (int[] arr, int l, int h)
	{
		int p =h;
		int j=l;
		int i=l-1;

		while(j != p)
		{
			if(arr[j] < arr[p])
			{
				i++;
				int temp =arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		i++;
		int temp =arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return i;
	}

//	public static void mergeSort(int []arr1, int[]arr2,int[] crr)
//	{
//		int i =0,j=0,k=0;
//		while (i<arr1.length && j<arr2.length)
//		{
//			if(arr1[i]<=arr2[j])
//			{
//				crr[k]=arr1[i];
//				k++;
//				i++;
//			}
//			else {
//				crr[k]=arr2[j];
//				k++;
//				j++;
//			}
//		}
//		if(i==arr1.length)
//		{
//			while (j<arr2.length)
//			{
//				crr[k]=arr2[j];
//				j++;
//				k++;
//			}
//		}
//		else {
//			while (i<arr1.length)
//			{
//				crr[k]=arr1[i];
//				i++;
//				k++;
//			}
//		}
//	}

	public static void merge(int[] crr,int l, int m, int r)
	{

		int n1 = m-l +1;
		int n2 = r-(m+1) +1;

		int [] arr = new int [n1];
		int [] brr = new int [n2];

		for (int i=0; i<arr.length; i++)
			arr[i] = crr[l+i];
		for (int i=0; i<brr.length; i++)
			brr[i] = crr[m+1+i];

		//arr, brr ==> crr

		int i =0;
		int j =0;
		int k =l;

		while (i<arr.length && j<brr.length)
		{
			if(arr[i]<=brr[j])
			{
				crr[k]=arr[i];
				k++;
				i++;
			}
			else {
				crr[k]=brr[j];
				k++;
				j++;
			}
		}
		
		// if else condition is optional.....
		if(i==arr.length)
		{
			while (j<brr.length)
			{
				crr[k]=brr[j];
				j++;
				k++;
			}
		}
		else {
			while (i<arr.length)
			{
				crr[k]=arr[i];
				i++;
				k++;
			}
		}
	}
	public static void mergeSort(int[] crr, int l, int r)
	{
	
		if(l<r) 
		{
			int m = (l+r)/2;
			
			mergeSort(crr,l,m);
			mergeSort(crr,m+1,r);
			merge(crr,l,m,r);
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
