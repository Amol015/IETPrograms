
public class DoublyEmpLL {

	private EmployeeNode head;
	private EmployeeNode tail;


	public DoublyEmpLL() {

		this.head = null;
		this.tail = null;
	}

	public void insert(Employee e) {
		EmployeeNode newNode = new EmployeeNode (e);

		if (head ==null && tail==null)
		{
			head=tail=newNode;
		}
		else 
		{
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void append(Employee e) 
	{
		EmployeeNode newNode = new EmployeeNode(e);

		if(tail==null && head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail= newNode;
		}
	}

	public void insertAtpos(Employee e,int pos) {

		EmployeeNode newNode = new EmployeeNode(e);

		if (pos==1)
		{
			insert(e);
			return;
		}

		EmployeeNode it = head;

		for (int i=1; i<pos-1; i++)
		{
			if (it.getNext()==null)
				break;
			it=it.getNext();
		}
		if(it!=tail)
		{
			newNode.setNext(it.getNext());
			newNode.setPrev(it);
			it.setNext(newNode);
			newNode.getNext().setPrev(newNode);
		}
		else 
		{
			append(e);
		}
	}

	private int getDLLength()       

	//find Length of LinkedList
	{
		//Node temp = new Node();
		int noOfNode =0;
		EmployeeNode it =head;
		while (it != null)
		{
			noOfNode++;
			it = it.getNext();
		}
		return noOfNode;
	}

	public void insertAtMiddle(Employee e3) {
		EmployeeNode temp =new EmployeeNode(e3);
		int noofnode =getDLLength();
		if(head==tail) {
			head =tail=temp;
		}
		else
		{
			int pos=noofnode/2;
			if(pos%2==0)
				insertAtpos(e3,pos);
			else
				insertAtpos(e3, (pos+1));
		}
	}

//	public void append(String name, int age, int salary) {
//
//		Employee e = new Employee(name,age,salary);
//		EmployeeNode newNode =new EmployeeNode(e);
//
//		if(tail==null && head==null)
//		{
//			head = newNode;
//			tail = newNode;
//		}
//		else
//		{
//			tail.setNext(newNode);
//			newNode.setPrev(tail);
//			tail= newNode;
//		}
//	}

	public void append(String name,int age,int salary) 
	{
		Employee emp=new Employee(name,age,salary);
		append(emp);
	}
	
	public void append(DoublyEmpLL list) {
		EmployeeNode it=list.head;
		while(it!=null) {
			append(it.getData());
			it=it.getNext();
		}
	}
	

	public void deleteOlderThan31Age()
	{
		EmployeeNode it=head; int i=1;
		while(it!=null)
		{
			if(it.getData().getAge()>31)
			{
				it=it.getNext();
				deleteByPos(i);
				continue;
			}
			i++;
			it=it.getNext();
		}
	}

	public void deleteFirst() {
		if(head==null)
			System.out.println("DLL is Empty ...");
		else {
			if(head.getNext()==null)
				head=tail=null;
			else {
				EmployeeNode it=head;
				head=it.getNext();
				it.setNext(null);
				it.setPrev(null);
				head.setPrev(null);
				it=null;
			}
		}
	}

	public void deleteByPos(int pos) {
		int noOfNodes=getDLLength();
		if(pos==1)
			deleteFirst();
		else if(pos==noOfNodes)
			deleteLast();
		else if (pos>1 && pos<noOfNodes){
			EmployeeNode it =head;
			EmployeeNode t=null;
			for(int i=1;i<pos;i++) // loop will run one  position before where we have to insert 
			{
				t=it;
				it=it.getNext();
			}
			t.setNext(it.getNext());
			it.getNext().setPrev(t);
			it.setNext(null);
			it.setPrev(null);
			it=null;
		}
	}

	public void deleteLast() {

		if(tail==null)
			System.out.println("DLL is Empty...");
		else if(head==tail)//head.next==null or tail.prev==null
			head=tail=null;
		else {
			EmployeeNode temp=tail;
			tail=temp.getPrev();
			tail.setNext(null);
			temp.setPrev(null);
			temp=null;
		}
	}
	
	public static DoublyEmpLL concat(DoublyEmpLL employeeList1 ,DoublyEmpLL employeeList2 )
	{
		DoublyEmpLL emp = employeeList1;
		EmployeeNode temp = employeeList2.head;
		emp.tail.setNext(temp);
		temp.setPrev(emp.tail);
		
		return emp;
		
	}

	public String toString()
	{
		String str=" ";
		if(this.head==null)
		{
			str=" Linkedlist is empty";
		}
		else
		{
			EmployeeNode it=head;
			while(it!=null)
			{
				str+=it.getData();
				it=it.getNext();
			}
		}
		return str;
	}
}
