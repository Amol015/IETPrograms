

public class Main {
	public static void main(String[] args) {
		Hashing hash=new Hashing(4);
		
		Student s1=new Student("Amol",24,9876543210L,"amol015@gmailcom");
		Student s2=new Student("Dilip",20,9753124680L,"dilip06@gmailcom");
		Student s3=new Student("Shivani",23,9631247680L,"shivani007@gmailcom");
		Student s4=new Student("Krishna",21,9289829173L,"prajakta78@gmailcom");
		
		
		hash.insertL(s1);               //Linear
		hash.insertL(s2);
		hash.insertL(s3);
		hash.insertL(s4);
		
		
		System.out.println("After removing :");
		hash.removeL(s4);
		hash.removeL(s3);
	
		//hash.removeL();
		

		System.out.println(hash);
	}
}
