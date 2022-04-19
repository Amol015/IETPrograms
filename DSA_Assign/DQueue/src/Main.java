
public class Main {

	
	public static void main(String[] args) {
		
		DQueue dQueue = new DQueue();
		
		dQueue.insertNewR(10);
		dQueue.insertNewR(20);
		dQueue.insertF(30);
		dQueue.removeR();
		dQueue.insertNewR(40);
		dQueue.removeF();
		
		System.out.println(dQueue);
		
	}
	
}