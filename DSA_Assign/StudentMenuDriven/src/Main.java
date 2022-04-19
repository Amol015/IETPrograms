
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students : ");
		int num = sc.nextInt();

		StudentStack stud = new StudentStack(num);

		do
		{
			System.out.println("Press \n1 push new student \n2 for poping student" +
					"\n3 for printing stack menbers \n0 for exit: ");
			num = sc.nextInt();
			switch(num)
			{
			case 0:
				return;
			case 1:
			{
				System.out.println("Enter Name:");
				String name = sc.next();

				System.out.println("Enter Age:");
				int age = sc.nextInt();

				System.out.println("Enter Gender:");
				char gender = sc.next().charAt(0);

				Student s = new Student(name,age,gender);
				stud.push(s);
				break;
			}
			case 2:
			{
				Student s = stud.pop();
				System.out.println(s);
				break;
			}
			case 3:
			{
				System.out.println(stud);
				break;
			}
			default :
				System.out.println("invalid Input : ");
			}
		}while(num != 0);
	}
}
