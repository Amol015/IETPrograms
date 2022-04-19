
public class Main {
	public static void main(String[]args) {
		QueueLL q1 =new QueueLL();
		
		q1.remove();
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.insert(40);
		q1.insert(50);
		
		System.out.println(q1);
		q1.remove();
		q1.remove();
		System.out.println(q1);
	}
}
