
public class Student {
	
	private String name;
	private int age;
	private char gender;
	private int marks;
	
	Student(String name, int age, char gender, int marks) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}

	public static void sortByAgeAscending(Student []arr)
	{
		for(int p=0; p<arr.length-1; p++)   
		{
			int i=p;
			Student x = arr[i];
			
			while(i<arr.length)     
			{
				
				if(arr[i].age < x.age)
				{
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;
				}
				i++;
			}
			arr[p] = x;
		}
	}
	
	public static void sortByNameAscending(Student []arr)
	{
		for(int p=0; p<arr.length-1; p++)   
		{
			int i=p;
			Student x = arr[i];
			
			while(i<arr.length)     
			{
				if(arr[i].name.compareToIgnoreCase(x.name) < 0)
				{
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;
				}
				i++;
			}
			arr[p] = x;
		}
	}
	
	public static void sortByMarksDescending(Student []arr)
	{
		
		for(int p=0; p<arr.length-1; p++)   
		{
			int i=p;
			Student x = arr[i];
			
			while(i<arr.length)     
			{
				if(arr[i].marks > x.marks)
				{
					Student tmp = arr[i];
					arr[i] = x;
					x = tmp;
				}
				i++;
				
			}
			arr[p] = x;
		}
		
	}
	
	public static void print(Student [] arr)
	{
		System.out.println("======================================");
		for (int i = 0; i < arr.length; i++) {  //n
			System.out.println(arr[i]);
		}
		System.out.println();		
	}

	public String toString() {
	
		String str = this.name + ":" + this.age + ":" + this.gender + ":" + this.marks;
		return str;
	}
	
}

