
public class Book {

	private int bookId;
	private String bookName;
	private int bookPrice;

	public Book()
	{
		bookId = 101;
		bookName = " Java Reference by Herbert Schildt";
		bookPrice = 799;
	}

	public Book(int id,String name,int price)
	{
		bookId = id;
		bookName = name;
		bookPrice = price;
	}

	public void display()
	{
		System.out.println("\nBook Information : \nBook Id :" +bookId+ "\nBook Name :" +bookName+ "\nBook Price :" +bookPrice);
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

}