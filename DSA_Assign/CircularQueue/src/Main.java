import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of 1st Queue s1");
		int size1 = sc.nextInt();
		CQueue q1 = new CQueue(size1);
		
		System.out.println("Enter Size of 1st Queue s2");
		int size2 = sc.nextInt();
		CQueue q2 = new CQueue(size2); 
		
		q1.insert(12);
		q1.insert(32);
		q1.remove();
		q1.remove();
		q1.insert(69);
		q1.insert(99);
		q1.insert(44);
		q1.insert(44); 
		
		q2.insert(1);
		q2.insert(3);
		q2.remove();
		q2.insert(5);
		q2.insert(6);
		
		
		System.out.println(q1);
		System.out.println(q2);
		
		CQueue q3 = q1.cancat(q2);
		System.out.println(q3);
		
		if(q1.equals(q2))
			System.out.println("Queue are same");
		else
			System.out.println("Queue are not same"); 
	}
}

