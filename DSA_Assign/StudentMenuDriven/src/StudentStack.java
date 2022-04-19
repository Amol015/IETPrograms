

public class StudentStack 
{
	private Student []st;
	private int top;;
	
	public StudentStack() 
	{
		this.st = new Student[5];
		this.top = -1;
	}
	
	public StudentStack(int len) 
	{
		this.st = new Student[len];
		this.top = -1;
	}
	
	public void push(Student s)
	{
		if(top < this.st.length-1)
		{
			top++;
			this.st[top] = s;
		}
		else
		{
			System.out.println("Stack Overflow...");
		}
	}
	public Student pop()
	{
		Student s = null;
		if(this.top != -1)
		{
			s = st[top];
			top--;
		}
		else
		{
			System.out.println("Stack Underflow...");
		}
		return s;
	}
	public String toString()
	{
		String str = "";
		if(top != -1)
		for (int i = top; i >= 0; i--)
		{
			str += st[i]+"\n";
		}
		else
		{
			System.out.println("Stack Underflow...");
			return null;
		}
		return str;
	}
}
