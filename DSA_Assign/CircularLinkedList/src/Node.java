
public class Node {
	
	int data ;
	Node next;
	Node()
	{
		data =0;
		next = null;
	}

	Node(int data)
	{
		this.data = data;
		this.next= null;
	}
	
	public String toString() {
		String str = "";
		str= data + "";
		return str;
	}
}
