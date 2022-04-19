
public class Main {

	public static void main(String[] args) {

		StackLL stack = new StackLL();
		stack.push(72);
		stack.push(22);
		stack.push(65);
		stack.push(85);
		stack.push(95);
		stack.push(67);
		stack.push(99);

		System.out.println("Stack Before Pop : "+stack);

		stack.pop();
		stack.pop();
		//stack.pop();
		stack.pop();

		System.out.println("Stack after Pop : "+stack);

		System.out.println( "Top most Element of the stack : "+stack.peek());

	}
}
