
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
	//*********************************************************************************
	//insert at first position...

	public void insert(int data)
	{
		Node newNode = new Node(data);

		if (head == null)  // condition to check if the linkedList is empty
			//  (no of nodes present)....
		{
			head = newNode;
		}

		else
		{
			newNode.next= head;
			head = newNode;
		}
	}

	//*********************************************************************************	
	//insert at last position / append....

	public void append(int data)
	{
		Node newNode = new Node(data);

		if (head == null)      // condition to check if the linkedList is empty (no of nodes present)....
		{
			head = newNode;
		}

		else
		{
			Node it = head;
			while(it.next !=null) //traverse till last node 
			{
				it=it.next;
			}
			it.next = newNode;
			newNode.next=null;    //make this as a last node...
		}
	}

	//********************************************************************************	
	//Insert at position (Data / postion)

	public void insertBypos(int value,int pos)
	{
		int noOfNodes =getLLLength();
		if(pos == 1)
		{
			insert(value);

		}
		else if (pos ==noOfNodes+1)
		{
			append(value);
		}

		else if (pos > 1 && pos < noOfNodes+1)
		{

			Node newNode = new Node();
			//we can surely insert it at postion...

			Node it = head;
			for (int i=1;i<pos-1;i++)
			{
				it = it.next;     
			}

			newNode.next = it.next;
			it.next = newNode;         
		}

		else 
		{
			System.out.println("Invalid position");
		}
	}
	//*********************************************************************************	
	// Delete from first position....

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
	//*********************************************************************************

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

	//*********************************************************************************
	
	private int getLLLength()       

	//find Length of LinkedList
	{
		//Node temp = new Node();
		int noOfNode =0;
		Node it =head;
		while (it != null)
		{
			noOfNode++;
			it = it.next;
		}
		return noOfNode;
	}
	//*********************************************************************************	
	//ToString to print the Linked List......
	
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
				str += +it.data + "  ";
				it=it.next;
			}
		}
		return str;
	}
	//*********************************************************************************	
	// Reverse Print using reccurssion....
	
	public void reverseprint()
	{
		reversePrintRec(head );
		System.out.println();
	}

	private void reversePrintRec(Node it)
	{
		if (it.next != null)
			reversePrintRec(it.next);

		System.out.print(it.data + "   ");
	}
	//**************************************************************************************
 
	public void deleteBypos(int pos)
	{
		
		int noOfNodes = getLLLength();
		
		if(pos == 1)
		{
			deleteFirst();
		}
		else if (pos == noOfNodes)
		{
			deleteLast();
		}
		
		else if (pos > 1 && pos < noOfNodes)
		{
		   Node it =head;
		   for (int i = 1; i<pos-1;i++)
		   {
			   it = it.next;
		   }
		   Node t = it.next;
		   it.next = t.next;
		   t.next = null;
		   
		}
		else 
		{
			System.out.println("Invalid Position..");
		}
	}
	
	public void reverseLL()
	{
		
	}

public int largest_number()
{
	int max=0;
	if(head==null)
		System.out.println("Linked List is Empty");
	else {
		Node it = head;
		max = it.data;
		while (it.next!=null)
		{
			if(it.data>max)
				max = it.data;
			it = it.next;
		}
	}
	return max;
	
}











	/*	void insert_at(int newElement, int position) {     

		  // allocate node to new element
		  Node newNode = new Node(); 
		  newNode.data = newElement;
		  newNode.next = null;


		  if (position == 1)
		  {

		    // if the position is 1, make next of the
		    //   new node as head and new node as head
		    newNode.next = head;
		    head = newNode;
		  } 

		  else
		  {

		    // Else, make a temp node and traverse to the 
		    //   node previous to the position
		    Node temp = new Node();
		    temp = head;

		    for(int i = 1; i < position-1; i++) {
		      if(temp != null)
		      {
		        temp = temp.next;
		      }
		    }

		    // If the previous node is not null, make 
		    //   newNode next as temp next and temp next 
		    //   as newNode.
		    if(temp != null) {
		      newNode.next = temp.next;
		      temp.next = newNode;  
		    } else {

		      // When the previous node is null
		      System.out.print("\nThe previous node is null.");
		    }       
		  }
		} 

	void delete_from(int position) {     

		  if (position == 1 && head != null) {

		    //2. if the position is 1 and head is not null, make
		    //   head next as head and delete previous head 
		    Node nodeToDelete = head;
		    head = head.next;
		    nodeToDelete = null;
		  } else {

		    //3. Else, make a temp node and traverse to the 
		    //   node previous to the position
		    Node temp = new Node();
		    temp = head;
		    for(int i = 1; i < position-1; i++) {
		      if(temp != null) {
		        temp = temp.next;
		      }
		    }

		    //4. If the previous node and next of the previous  
		    //   is not null, adjust links 
		    if(temp != null && temp.next != null) {
		      Node nodeToDelete = temp.next;
		      temp.next = temp.next.next; 
		      nodeToDelete = null; 
		    } else {

		      //5. Else the given node will be empty.
		      System.out.print("\nThe node is already null.");
		    }       
		  }
		}     */ 

}