
public class LinkedList  {

	Node head;

	// parameterless constructor
	public LinkedList() {

		this.head = null;
	}
	
	// parameterised constructor
	public LinkedList(Node head) {

		this.head = head;
	}

	//insert at first position...
	public void insert(Employee data)
	{
		Node temp = new Node(data);

		if (head == null)      // condition to check if the linkedList is empty (no of nodes present)....
		{
			head = temp;
		}

		else
		{
			temp.next= head;
			head = temp;
		}
	}

	//insert at last position/ append....
	public void append(Employee data)
	{
		Node temp = new Node(data);

		if (head == null)      // condition to check if the linkedList is empty (no of nodes present)....
		{
			head = temp;
		}

		else
		{
			Node it = head;
			while(it.next !=null) //traverse till last node 
			{
				it=it.next;
			}
			it.next = temp;
			temp.next=null;    //make this as a last node...
		}

	}

	public void deleteFirst()
	{
		if (head ==null)
			System.out.println("Linked List is Empty...");

		else {
			if (head ==null)
			{
				head=null;
			}
			else
			{
				Node t = head;
				head = t.next;
				t.next= null;
			}
		}
	}
	
	public void deleteLast()
	{

		if (head == null) // condition if list is already empty....
		{
			System.out.println("Linked List is Empty...");
		}
		else {

			if (head.next == null ) // condition if their is only one node present 
			{
				head =null;
			}
			else
			{

				Node it = head;
				// traverse upto second last node
				while (it.next.next != null)
				{
					it = it.next;
				}
				// Change next of second last
				it.next = null;
			}
		}
	}

	public String toString() {
		String str="";
		if(head == null)
		{
			str = "LinkedList is empty..";
		}
		else
		{
			Node it = head;
			//while(it.next !=null) without last node
			while(it !=null) // till last node 
			{
				str = str + it.data + "  ";
				it=it.next;
			}
		}
		return str;
	}
}























