
public class CircularLL {

	Node head;

	// parameterless constructor
	public CircularLL() {

		this.head = null;
	}

	// parameterised constructor
	public CircularLL(Node head) {

		this.head = head;
	}

	public void insertFirst(int value){

		Node newNode = new Node(value);
		//newNode.data = value;
		newNode.next = null;

		if(head == null) {
			head = newNode;
			newNode.next = head;
		} 
		else 
		{
			Node temp = new Node();
			temp = head;
			while(temp.next != head)
			      temp = temp.next;
			
			temp.next = newNode;
			newNode.next = head;
			head = newNode;
		}    
	}

	void append(int value) {

		Node newNode = new Node();

		// assign data element
		newNode.data = value;

		// assign null to the next of new node
		newNode.next = null; 

		//Check the list is empty or not,
		//   if empty make the new node as head 
		if(head == null) {
			head = newNode;
			newNode.next = head;
		} else {

			// Else, traverse to the last node
			Node temp = head;
		
			while(temp.next != head)
			{
				temp = temp.next;
			}
			// Adjust the links
			temp.next = newNode;
			newNode.next = head;
		}    
	}

	private int getCLLLength() {

		if (head==null)
			return 0;
		else
		{
			int noOfNode =1;
			Node it =head;
			while (it.next != head)
			{
				noOfNode++;
				it = it.next;
			}
			return noOfNode;
		}
	}

	public void insertByPos(int value,int pos)
	{
		int noOfNodes = getCLLLength();
		if (pos==1)
		{
			insertFirst(value);
		}
		else if (pos == noOfNodes+1)
		{
			append(value);
		}
		else if (pos > 1 && pos< noOfNodes+1)
		{
			Node newNode =new Node (value); //we are sure..... inserting in middle ...
			Node temp = head;
             System.out.println(temp.data);
			for(int i =1; i<pos-1;i++)
			{
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next=newNode;
		}
		else 
			System.out.println("Enter Valid Position....");
	}


	public void deleteFirst()
	{
		if (head ==null)
			System.out.println(" Circular Linked List is Empty...");

		else if(head.next==head)
		{
			head.next=null;
			head=null;
		}
		
		else
		{
			Node tmp = head;
			Node it = head;
			while(it.next != head)
				it=it.next;

			head = head.next;
			it.next = head;
			tmp.next = null;
		}
	}


public void deleteLast()
{

	if (head == null) // condition if list is already empty....
	{
		System.out.println(" circular Linked List is Empty...");
	}
	else if (head.next == head ) // condition if their is only one node present 
		{
			head.next =null;
			head= null;
		}
		else
		{
			Node it = head.next;
			// traverse upto second last node
			while (it.next.next != head)
			{
				it = it.next;
			}
			Node tmp = it.next;
			it.next = head;
		}
	}
 
public String toString() {
	String str="";
	if(head == null)
	{
		str = "Circular LinkedList is empty..";
	}
	else
	{
		str+= head.data + "  ";
		Node it = head.next;
		//while(it.next !=null) without last node
		while(it !=head) // till last node 
		{
			str += +it.data + "  ";
			it=it.next;
		}
	}
	return str;
}
}
 