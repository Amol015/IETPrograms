
public class Main {

	public static void main(String[] args) {

		int [] arr1 = new int[]{50, 20, 100, 5, 76, 75, 1,23};
		int [] arr2 = new int[]{77, 22, 101, 55, 78, 71, 10,24};
		int [] crr = new int[arr1.length+arr2.length];
		{

//			System.out.print("Array1	 : ");
//			QuickMergeSort.print(arr1);
//			System.out.print("Array2	 : ");
//			QuickMergeSort.print(arr2);
//
//			QuickMergeSort.quickSort(arr1,0, arr1.length-1);
//			QuickMergeSort.quickSort(arr2,0, arr2.length-1);
//			System.out.print("QuickSort(array1): ");
//			QuickMergeSort.print(arr1);
//			System.out.print("QuickSort(array2): ");
//			QuickMergeSort.print(arr2);
//			QuickMergeSort.mergeSort(arr1, arr2, crr);
//			System.out.print("MergeSort: ");
//			QuickMergeSort.print(crr);
			
			
			QuickMergeSort.print(arr2);
			QuickMergeSort.mergeSort(arr2,0,arr2.length-1);
			System.out.print("MergeSort 2: ");
			QuickMergeSort.print(arr2);
			
			
		}
	}
}
