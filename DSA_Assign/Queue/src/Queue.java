public class Queue {
	int []arr;
	int front;
	int rear ;

	Queue(){
		arr=new int[5];
		front=-1;
		rear=-1;
	}

	public void insert(int data) {
		if(rear<arr.length-1) // space available 

		{
			rear++;
			arr[rear]=data;

			if(front==-1) {
				front++;
			}
		}
		else {
			System.out.println("Queue is Full");
		}
	}

	public void remove() {
		if(front!=-1) {
			if(front!=rear) 
			{
				front++;
			}
			else 
			{
				front=rear=-1;
			}
		}
		else 
		{
			System.out.println("Queue is Empty");
		}
	}

	public void print() {

		if(front==-1) {
			System.out.println("Queue is Empty");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println(""+arr[i]);
			}
		}
	}
}
