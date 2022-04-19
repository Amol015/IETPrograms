
public class Main {

	public static void main(String[] args) {
		
		Student[] arr= new Student[6];
		
		arr[0]= new Student("Amol", 25, 123446,"aa@gmail.com" );
		arr[1]= new Student("Dilip", 24, 2123446,"bb@gmail.com" );
		arr[2]= new Student("Shivani", 23, 3123446,"cc@gmail.com" );
		arr[3]= new Student("Prajkta", 21, 4123446,"dd@gmail.com" );
		arr[4]= new Student("Ashwini", 20, 5123446,"ee@gmail.com" );
		arr[5]= new Student("Krishna", 26, 6123446,"ff@gmail.com" );
		
		//System.out.print("Array1	 : ");
		QuickSort.print(arr);
		QuickSort.quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array (By Age) :");
		QuickSort.print(arr);
//		QuickMergeSort.mergeSort(arr1, arr2, crr);
//		System.out.print("MergeSort: ");
		
	}

}
