import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of lines to be printed :");

		int rows = sc.nextInt();

		System.out.println("Required Pattern..");

		for (int i = 1; i <= rows; i++) 
		{
			int number = i;

			for (int j = 1; j <= i; j++) 
			{
				System.out.printf("%2d ",number);

				number = number+rows-j;
			}

			System.out.println();
		}
	}
}
