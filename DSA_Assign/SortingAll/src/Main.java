public class Main {

	public static void main(String[] args) {
		
		int [] arr = new int[]{50, 20, 100, 5, 5, 76, 75, 11, 4000, 6, 7, 3, 9, 223};
		//int [] arr = new int[]{500, 400, 110, 102, 50, 40, 30, 20, 10};
		//int [] arr = new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		/*Sort.print(arr);
		Sort.selectionAscending(arr);
		Sort.print(arr);
		Sort.selectionDescending(arr);
		Sort.print(arr);*/
		
		/*Sort.print(arr);
		Sort.insertionAscending(arr);
		Sort.print(arr);
		Sort.insertionDescending(arr);
		Sort.print(arr);
		
		Sort.print(arr);
		Sort.bubbleAscending(arr);
		Sort.print(arr);
		Sort.bubbleDescending(arr);
		Sort.print(arr);*/
		
		/*Sort.print(arr);
		Sort.quickSort(arr, 0, arr.length-1);
		Sort.print(arr);*/
		
		Sort.print(arr);
		Sort.mergeSort(arr, 0, arr.length-1);
		Sort.print(arr);
		
	}
}