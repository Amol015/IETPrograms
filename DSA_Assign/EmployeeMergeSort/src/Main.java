
public class Main {
public static void main(String[] args) {
		
		Employee[] arr= new Employee[6];
		
		arr[0]= new Employee("Amol", 21, 12555.55f,101);
		arr[1]= new Employee("Dilip", 22, 12555.55f,105);
		arr[2]= new Employee("Shivani", 24, 12555.55f,108);
		arr[3]= new Employee("Prajakta", 36, 12555.55f,103);
		arr[4]= new Employee("Ashwini", 18, 12555.55f,107);
		arr[5]= new Employee("Krishna",28, 12555.55f,102);
		
		MergeSort.mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted Employee Details according to EmpId :");
		MergeSort.print(arr);
		
}
		

}
