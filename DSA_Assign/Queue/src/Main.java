
public class Main {
	
	public static void main(String[]args){
		
		Queue s1 = new Queue();
		s1.insert(10);
		s1.insert(20);
		s1.insert(30);
    	s1.insert(40);
	
		s1.remove();
		s1.remove();
		s1.remove();
		s1.remove(); //Queue is Empty

		s1.insert(10);
		s1.insert(20);
		s1.insert(30);
		s1.insert(40);
		s1.insert(10);
		s1.insert(20); //Queue is Full
		
		s1.remove();
		s1.remove();
		s1.remove();
		s1.remove(); //10
		
		s1.insert(20); //Queue is Full
		s1.insert(30); //Queue is Full
		s1.insert(40); //Queue is Full
		s1.insert(10); //Queue is Full 
		s1.insert(20); //Queue is Full
		
		s1.remove();  //Queue is Empty
		
		s1.print();
		
	}
}
