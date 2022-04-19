
public class Main {

	public static void main(String[] args) {

		BST bst = new BST();

		bst.insert(23);
		bst.insert(34);
		bst.insert(45);
		bst.insert(12);
		bst.insert(43);
		bst.insert(73);
		bst.insert(61);
		bst.insert(2);
		bst.insert(5);
		bst.insert(7);
		bst.insert(10);
		bst.insert(11);
		bst.inOrder();
	//	bst.delete(34);
		bst.inOrder();
		bst.preOrder();
		bst.postOrder();
		
		
	 System.out.println("Tree Height : "+bst.calHeight());
	 System.out.println("Tree Height : "+bst.height(bst.root));
		
	}

	
}
