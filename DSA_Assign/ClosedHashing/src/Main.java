
public class Main {
	public static void main(String[] args) {
		Hashing hash=new Hashing(5);

		hash.insertL("Amol");               //Linear
		hash.insertL("Dilip");
		hash.insertL("Shivani");
		hash.insertL("Prajakta");
		hash.insertL("Ashwini");

		hash.insertL("Amol");               //Linear
		hash.insertL("Dilip");
		hash.insertL("Shivani");
		hash.insertL("Prajakta");
		hash.insertL("Ashwini");


		hash.removeL("Ashwini");
		hash.removeL("Prajakta");
		hash.removeL("ABC");
		hash.removeL("Amol ");

		System.out.println();
		System.out.println(hash);
	}
}
