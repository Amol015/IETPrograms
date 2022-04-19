public class Sort 
{
	//---------------SELECTION SORT--------------------


	// Ascending selection sort
	public static void selectionA(int []arr)
	{
		for (int i = 0; i < arr.length-1; i++) {

			int x= arr[i]; //
			for (int j = i+1; j < arr.length; j++) {

				if(arr[j]<x)
				{
					int tmp = arr[j];
					arr[j] = x;
					x = tmp;
				}

			}
			arr[i]=x;
		}
	}
	/*for(int p=0; p<arr.length-1; p++)
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
	}*/

	// Descending selection sort
	public static void selectionD(int []arr)
	{
		for(int p=0; p<arr.length-1; p++)
		{
			int i=p;
			int x = arr[i];

			while(i<arr.length)
			{
				if(arr[i] > x)
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

	/*
	 *		n = no. of inputs
	 *		Space Complexity = O(1) 
	 *		Time Complexity = O(n^2) 
	 */


	//-----------------INSERTION SORT-----------------

	//Ascending insertion sort
	public static void insertionA(int []arr)
	{
		for(int j=1; j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i]<arr[i-1])
				{
					int tmp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=tmp;
					i--;
				}
				else
					break;
			}
		}
	}

	public static void insertionD(int []arr)
	{
		for(int j=1; j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i]>arr[i-1])
				{
					int tmp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=tmp;
					i--;
				}
				else
					break;
			}
		}
	}

	/*
	 * 	   	n = no. of inputs
	 *     	Space Complexity = O(1) 
	 *     	Time Complexity = O(n^2)
	 */


	//-----------------BUBBLE SORT--------------------

	public static void bubbleA(int []arr)
	{
		for (int j = 0; j < arr.length-1; j++) 
		{
			for (int i = 0; i < arr.length-1; i++) 
			{
				if(arr[i+1] < arr[i])
				{
					int tmp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=tmp;
				}

			}
		}
	}

	public static void bubbleD(int []arr)
	{
		for (int j = 0; j < arr.length-1; j++) 
		{
			for (int i = 0; i < arr.length-1; i++) 
			{
				if(arr[i+1] > arr[i])
				{
					int tmp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=tmp;
				}
				else
					break;
			}
		}
	}

	/*
	 * 	   	n = no. of inputs
	 *     	Space Complexity = O(1) 
	 *     	Time Complexity = [O(n-1)*O(n-1)] ==> O(n^2)
	 */

	public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}

	public static void quickSort(int []arr ,int l,int h)
	{
		if(l<h)
		{
			int pi=partition(arr,l,h);
			quickSort(arr,l,pi-l);
			quickSort(arr,pi+1,h);		
		}
	}

	private static int partition(int arr[],int l,int h)
	{
		int p=h;
		int i=l-1;
		int j=l;

		while(j != p)
		{
			if(arr[j] < arr[p])
			{
				i++;
				int tmp=arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			j++;
		}
		i++;

		int tmp=arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;

		return i;
	}

	public static void merge(int [] crr, int l, int m, int r)
	{
		int n1 = m-l + 1;
		int n2 = r-(m+1) + 1;
		
		int [] arr = new int[n1];
		int [] brr = new int[n2];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = crr[l+i];
		
		for(int i=0; i<brr.length; i++)
			brr[i] = crr[m+1+i];
		
		// arr, brr ==> crr
		
		int i=0;  //arr
		int j=0;  //brr
		int k=l;  //crr
		
		while(i < arr.length && j < brr.length)
		{
			if(arr[i] <= brr[j])
			{
				crr[k] = arr[i];
				k++;
				i++;
			}
			else
			{
				crr[k] = brr[j];
				k++;
				j++;
			}
		}
		
		if(i == arr.length)
		{
			while(j < brr.length)
			{
				crr[k] = brr[j];
				k++;
				j++;
			}
		}
		else
		{
			while(i < arr.length)
			{
				crr[k] = arr[i];
				k++;
				i++;
			}
		}		
	}

	public static void mergeSort(int[] crr, int l, int r) 
	{
		if(l<r)
		{
			int m = (l+r)/2;
			
			mergeSort(crr, l, m);
			mergeSort(crr, m+1, r);
			
			merge(crr, l, m, r);
			
		}
	}
}
