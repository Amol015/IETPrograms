import java.util.Scanner;

public class Main {
	public static  Scanner sc =new Scanner (System.in);

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		int choice;
		do {
			int id,salary;
			String name;
			
			System.out.println("operations to be performed Enter your choice");
			System.out.println("1. Insert Node");
			System.out.println("2. Append Node");
			System.out.println("3. Delete First Node");
			System.out.println("4. Delete Last Node");
			System.out.println("5. To Print the Linked ");
			System.out.println("6. Exit..");

			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice)
			{
			case 1 : System.out.println("\n Enter id  Name Salary Employee");
			id = sc.nextInt();
			name= sc.next();
			salary=sc.nextInt();
			list.insert(new Employee(id,name,salary));
			break;

			case 2 : System.out.println("\n Enter id  Name Salary Employee");
			id = sc.nextInt();
			name= sc.next();
			salary=sc.nextInt();
			list.append(new Employee(id,name,salary));
			break;

			case 3 : list.deleteFirst();
			break;

			case 4 : list.deleteLast();
			break;

			case 5 : System.out.println(list);
			break;

			case 6 : break;
			}
		}
			while(choice!=6);

		}
	}

