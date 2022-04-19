
public class Node {
	Node prev;
	Node next;
	int data;

	public Node() {
		prev = null;
		data =0;
		next =null;
	}
	public Node(int data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	}
	public Node(Node prev,int data,Node next) {
		this.prev = prev;
		this.next =next;
		this.data = data;
	}
	
	public String toString() {
		return (" " + data);
	}
}
