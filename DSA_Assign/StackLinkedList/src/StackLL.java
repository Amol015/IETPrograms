
public class StackLL {

	Node top;
	// parameterless constructor
	public StackLL() {

		this.top = null;
	}

	public void push(int data) {
		Node temp = new Node(data);

		if (top == null)      // condition to check if the linkedList is empty (no of nodes present)....
		{
			top = temp;
		}
		else
		{
			temp.next= top;
			top = temp;
		}
	}

	public void pop() {

		if (top ==null) {
			System.out.println("Linked List is Empty...");
			
		}
		else
		{
			if (top.next ==null)
			{
				top=null;
		//		return 0;
				
			}
			else
			{
				Node t = top;
				top = t.next;
				t.next= null;
			//	return top.data;
			}
			
		}
	}
	
	public int peek() {
        if(top==null) {
            System.out.println("stack is empty ");
        }
        
    		return top.data;
    }
	public	String toString() {
		String str="";
		if(top == null)
		{
			str = "LinkedList is empty..";
		}
		else
		{
			Node it = top;
			//while(it.next !=null) without last node
			while(it !=null) // till last node 
			{
				str += +it.data + "  ";
				it=it.next;
			}
		}
		return str;
	}
}
