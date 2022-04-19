import java.util.Scanner;

public class Main {

	public static void main(String[] args, Student[] students) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int num = sc.nextInt();

		
		Student.print(students);
		Student.sortByAgeAscending(students);
		Student.print(students);
		Student.sortByMarksDescending(students);
		Student.print(students);
		Student.sortByNameAscending(students);
		Student.print(students);
	
	}
}

