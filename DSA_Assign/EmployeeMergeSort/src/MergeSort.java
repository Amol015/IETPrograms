
public class MergeSort {

	public static void merge(Employee[] crr,int l, int m, int r)
	{

		int n1 = m-l +1;
		int n2 = r-(m+1) +1;

		Employee [] arr = new Employee [n1];
		Employee [] brr = new Employee [n2];

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
			if(arr[i].getEmpid()<=brr[j].getEmpid())
				//if(arr[i].getName().compareToIgnoreCase(brr[j].getName())<0)
				//	if(arr[i].getAge()<=brr[j].getAge())
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
	public static void mergeSort(Employee[] crr, int l, int r)
	{
	
		if(l<r)
		{
			int m = (l+r)/2;
			
			mergeSort(crr,l,m);
			mergeSort(crr,m+1,r);
			merge(crr,l,m,r);
		}
	}
	
	public static void print(Employee [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();		
	}
}
