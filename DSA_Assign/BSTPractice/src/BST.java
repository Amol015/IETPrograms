

public class BST {

	Node root;

	public BST() {
		root=null;
	}


	public void insert(int data)
	{
		if(root ==null)
		{
			Node newNode = new Node(data);
			root = newNode;
		}

		else 
		{
			Node newNode = new Node(data);

			Node it = root;
			while(true)
			{
				if (data < it.data) //New value is greater than Node value 
				{
					if (it.left == null)
					{
						it.left = newNode; //check for place in left of node 
						break;
					}
					else
					{
						it= it.left;
					}
				}
				else if (data>it.data)
				{
					if (it.right == null)
					{
						it.right = newNode;
						break;
					}
					else
					{
						it= it.right;
					}
				}
				//Duplicate Values.......
				else break;
			}
		}
	}
	//PLR
	public void preOrder()
	{
		System.out.print("PreOrder :");
		printPreOrder(root);
		System.out.println();
	}
	
	private void printPreOrder(Node it) {
		if (it !=null)
		{
		System.out.print(it.data + " ,");
		printPreOrder(it.left);
		printPreOrder(it.right);
		}
	}

	//LPR
	public void inOrder()
	{
		System.out.print("InOrder :");
		printInOrder(root);
		System.out.println();
	}
	private void printInOrder(Node it) {
		
		if (it !=null)
		{
		printInOrder(it.left);
		System.out.print(it.data + " ,");
		printInOrder(it.right);
		}
	}

	//LRP
	public void postOrder()
	{System.out.print("PostOrder :");
	printPostOrder(root);
	System.out.println();
	}


	private void printPostOrder(Node it) {
		if (it !=null)
		{
		printPostOrder(it.left);
		printPostOrder(it.right);
		System.out.print(it.data + " ,");
		}
		
	}
}

