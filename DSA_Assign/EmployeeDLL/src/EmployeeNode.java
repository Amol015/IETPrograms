
public class EmployeeNode {

	private Employee data;
	private EmployeeNode prev;
	private EmployeeNode next;


	public EmployeeNode(Employee data, EmployeeNode prev, EmployeeNode next) {

		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public EmployeeNode(Employee data) {

		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public EmployeeNode() {

		this.data = null;
		this.prev = null;
		this.next = null;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public EmployeeNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeNode prev) {
		this.prev = prev;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
//
//	@Override
//	public String toString() {
//		return "EmployeeNode [data=" + data + "]";
	}

