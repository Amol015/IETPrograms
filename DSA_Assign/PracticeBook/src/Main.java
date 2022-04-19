
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id :");
	    int id = sc.nextInt();
	    System.out.println("Enter Book Name :");
	    String name = sc.next();
	    System.out.println("Enter Book Price :");
	    int price = sc.nextInt();
	    
	    Book b2 = new Book(id,name,price);
	    
	    b1.display();
	   System.out.println(b2);
	    
	    System.out.println(b1);
	    b2.setBookPrice(599);
	    System.out.println(b2);
	    
	

	}

}
