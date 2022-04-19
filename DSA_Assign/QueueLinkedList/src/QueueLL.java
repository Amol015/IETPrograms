
public class QueueLL {
	private Node head;
	
	//Queue Insert =>InsertLast //append
	public void insert(int data) {
		Node tmp=new Node(data);
		if(head==null) {
			head=tmp;
		}
		else {
			Node it=head;
			while(it.next!=null) {
				it=it.next;
			}
			it.next=tmp;
		}
	}
	
	//Queue Remove => DeleteFirst
	public void remove() {
		if(head==null) {
			System.out.println("Queue is Empty");
		}
		else {
			Node tmp=head;
			head=tmp.next;
			tmp=null;
		}
	}
	
	public String toString() {
		String str="";
		if(head==null) {
			str="Queue is Empty";
		}
		else {
			Node it=head;
			while(it!=null) {
				str=str+it.data+", ";
				it=it.next;
			}
		}
		return str;
	}
}
