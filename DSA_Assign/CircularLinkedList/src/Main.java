
public class Main {

	public static void main(String[] args) {

		CircularLL cll = new CircularLL();
		cll.insertFirst(100);
		System.out.println(cll);
		cll.insertFirst(200);
		System.out.println(cll);
		cll.append(300);
		System.out.println(cll);
		cll.append(400);
		System.out.println(cll);
		cll.insertByPos(500, 2);
		System.out.println(cll);
		cll.deleteFirst();
		System.out.println(cll);
		cll.deleteLast();
		System.out.println(cll);
		
	}

}
