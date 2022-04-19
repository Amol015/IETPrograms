
public class Main {

	public static void main(String[] args) {
		
		
//		Node head = new Node(11);
//		
//		// Node n2 =new Node(22);
//		// head.next=n2;
//		
//		head.next = new Node (22);
//		head.next.next = new Node (33);
//		head.next.next.next = new Node (44);
//		
//		System.out.println(head.data + " ,"+
//				           head.next.data + " ,"+
//				           head.next.next.data + " ");
		
		LinkedList list =new LinkedList();
		list.insert(24);
		list.insert(233);
		list.append(23);
		list.append(67);
		list.insert(51);
		list.insert(24);
		list.insert(33);
		list.insert(60);
		list.insert(45);
		list.insert(267);
		list.deleteFirst();
		list.append(335);
		list.deleteLast();
		list.deleteLast();
    	list.deleteLast();
	//	list.insert_at(34232, 4);
		System.out.println( "Linked List :- "+list);
	//	list.delete_from(5);
		System.out.println( "Linked List :- "+list);
		list.reverseprint();
		System.out.println( "Linked List :- "+list);
		list.deleteBypos(4);
		System.out.println( "Linked List :- "+list);
	}
	

	

}
