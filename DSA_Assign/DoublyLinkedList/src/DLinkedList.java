
public class DLinkedList {

	Node head;
	Node tail;

	public DLinkedList() {

		this.head= null;
		this.tail=null;
	}

	//Insert at first Position.......

	public void insert(int data)
	{
		Node newNode = new Node(data);

		if (head==null)
		{
			head = newNode;
			tail= newNode;
		}

		else 
		{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}

	}

	public void append (int data)
	{
		Node newNode = new Node(data);

		if(tail==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next=newNode;
			newNode.prev = tail;
			tail= newNode;
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Doubly Link List is Empty");
		}
		else {
			if(head.next==null) {
				head=null;
				tail=null;
			}
			else {
				Node tmp=head;
				head=head.next;
				head.prev=null;
				tmp.next=null;
			}
		}
	}
	
	public void deleteLast()
	{
		if (tail==null)
		{
			System.out.println("Linked List is Empty.......");
		}
		
		else 
		{
			if (tail.prev ==null)
			{
				head = null;
				tail = null;
			}
			else 
			{
				Node temp = tail;
				tail = tail.prev;
				tail.next=null;
				temp.prev = null;
			}
		}
	}
	
	private int noOfNodes() {
		int count=0;
		Node it=head;
		while(it!=null) {
			it=it.next;
			count++;
		}
		return count;
	}
	
	public void insertByPos(int data,int pos) {
		if(pos==1) {
			insert(data);
		}
		else if(pos==noOfNodes()+1){
			append(data);
		}
		else if(pos>1 && pos<noOfNodes()+1) {
			Node tmp=new Node(data);
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			tmp.next=it.next;
			it.next=tmp;
			tmp.next.prev=tmp;
			tmp.prev=it;
		}
		else 
		{
			System.out.println("Invalid Position!");
		}
	}
	
	public void deleteByPos(int pos) {
		if(pos==1) {
			deleteFirst();;
		}
		else if(pos==noOfNodes()){
			deleteLast();;
		}
		else if(pos>1 && pos<noOfNodes()) {
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			Node tmp=it.next;
			tmp.next.prev=tmp.prev;
			it.next=tmp.next;
			tmp.next=null;
			tmp.prev=null;
		}
		else 
		{
			System.out.println("Invalid Position!");
		}
	}
	
	public void reverse() {
		Node tmp;
		Node it=head;
		while(it!=null) {
			tmp=it.next;
			it.next=it.prev;
			it.prev=tmp;
			
			it=it.prev;
		}
		tmp=head;
		head=tail;
		tail=tmp;
	}

	public void reversePrint() {
		Node it=tail;
		while(it!=null) {
			System.out.print(it+", ");
			it=it.prev;
		}
		System.out.println();
	}
	
	public String toString() {
		String str="";
		if(head==null) {
			str=str+"Doubly Link List is Empty";
		}
		else {
			Node it=head;
			while(it!=null) {
				str=str+it+", ";
				it=it.next;
			}
		}
		return str;
	}
}
