
public class Node {

	int data;
	Node next;

	// parameterless constructor
	public Node()
	{
		data = 0;
		next =null;
	}

	// parameterised constructor with data 
	public Node(int data )
	{
		this.data = data;
		this.next =null;
	}

	// parameterised constructor with Node
	public Node(Node next)
	{
		this.data =data ;
		this.next =null;
	}

	// parameterised constructor with Node and data 
	public Node(int data ,Node next )
	{
		this.data = data;
		this.next =null;
	}

}
