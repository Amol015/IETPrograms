
public class MyClass {

	static int input []=new int[20];

	public static int count(int key)
	{
		int low, high, cnt,mid;
		low = 0; 
		high = input.length-1;
		mid = (low+high)/2;
		cnt=0;
		while((input[mid]!=key)&& (low<=high))
		{
			if(key<input[mid])
				high= mid -1;
			else 
				low = mid +1;
			mid =(low +high)/2;
		}
		if (input[mid]==key)
		{
			cnt=cnt+1;
			low = mid -1;
			while(input[low]==key)
			{
				cnt=cnt+1;
				low =low-1;
			}
			//for (low=mid-1;input[low]==key;cnt++,low--);

			high = mid+1;
			while(input[high]==key)
			{
				cnt=cnt+1;
				high=high +1;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {

		System.out.println(count(70)+ "Students");

	}
}
