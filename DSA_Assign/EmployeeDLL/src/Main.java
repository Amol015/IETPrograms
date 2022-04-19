
public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("(A) Amol ", 34,15500);
		Employee e2 = new Employee("(B) Krishna ", 31,15600);
		Employee e3 = new Employee("(C) Ashwini ", 32,15100);
		Employee e4 = new Employee("(D) Shivani",30,15200);
		Employee e5 = new Employee("(E) Prajakta",31,15300);

		DoublyEmpLL employeeList1 = new DoublyEmpLL();
		employeeList1.insert(e1);
		employeeList1.append(e2);
		employeeList1.insertAtMiddle(e3);

		DoublyEmpLL employeeList2 = new DoublyEmpLL();

		employeeList2.append(e4);
		employeeList2.insert(e5);
		employeeList2.append("(F) Dilip", 31, 15900);
		System.out.println("	Linked List 1 :");
		System.out.println(employeeList1);
		System.out.println("=======================================================================================");
		System.out.println("	Linked List 2 :");
		System.out.println(employeeList2);
		System.out.println("=======================================================================================");

		employeeList1.append(employeeList2);
		System.out.println("	employeeList1.append(employeeList2)"); 

		System.out.println(employeeList1);
		System.out.println("=======================================================================================");

		employeeList1.deleteOlderThan31Age();
		System.out.println("After deleteing older than 31 ");
		System.out.println(employeeList1);
		

		//	DoublyEmpLL.printCommonEmployees(employeeList1, employeeList2);
		//
		DoublyEmpLL employeeList3 =DoublyEmpLL.concat(employeeList1, employeeList2);
		System.out.println("	After Concatination:");
		System.out.println(employeeList3);
	}
}
