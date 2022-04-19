
public class Stack {
	private int [] arr;
	private int top;
	public Stack () {
		this.arr = new int[5];
		this.top = -1;
	}
	
	public void puch (int val)
	{
		if (this.top< this.arr.length-1)
		{
			this.top++;
			this.arr[this.top]=val;
		}
		else
			System.out.println("OVERFLOW");
	}
	public int pop()
	{
		if(this.top != -1)
		{
			int val = this.arr[this.top];
			this.top--;
			return val;
		}
		else
			System.out.println("UNDERFLOW");
		return 0;
	}
	public String toString() {
		String str = " ";
		if(top == -1)
			str = "STACK IS EMPTY";
		else
		{
			for(int i=top; i>=0; i--)
				str +=(this.arr[i] + " ");
		}
		return str;
	}


}
