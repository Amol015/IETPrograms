

public class CQueue
{
	private int []que;
	private int F,R;
	public CQueue(int size) 
	{
		this.que = new int[size];
		this.F=this.R=-1;
	}
	public CQueue() 
	{
		this.que = new int[5];
		this.F=this.R=-1;
	}
	public void insert(int num)
	{
		if((this.F != this.R+1) || (this.R == this.que.length-1 && this.F != 0))
		{
			if(this.R == this.que.length-1)
			{
				this.R=0;
			}
			else
			{
				this.R++;
			}
			this.que[this.R] = num;
			if( this.F == -1)
				this.F++;
		}
		else
		{
			System.out.println("Queue is full...");
		}
	}
	public int remove()
	{
		if(this.F == -1)
		{
			System.out.println("Queue is empty...");
			return 0;
		}
		else
		{
			int value = this.que[this.F];
			if(this.F == this.R)
			{
				this.F=this.R=-1;
				return value;
			}
			if(this.F == this.que.length-1)
			{
				this.F=0;
				return value;
			}
			else
			{
				this.F++;
				return value;
			}
		}
	}

	public String toString() 
	{
		if(this.F != -1)
		{
			String str = "";
			for (int i = this.F; i != this.R;) 
			{
				str += this.que[i] + "  ";
				if(i == this.que.length-1)
					i=0;
				else 
					i++;
			}
			str += this.que[R] + "  ";
			return str;
		}
		else
		{
			System.out.println("Queue is empty...");
			return null;
		}
	}
	public CQueue cancat(CQueue q)
	{
		CQueue res = new CQueue(this.que.length + q.que.length);
		for (int i = this.F; i != this.R;) 
		{
			res.insert(this.que[i]); 
			if(i == this.que.length-1)
				i=0;
			else 
				i++;
		}
		res.insert(this.que[this.R]); 

		for (int i = q.F; i != q.R;) 
		{
			res.insert(q.que[i]); 
			if(i == q.que.length-1)
				i=0;
			else 
				i++;
		}
		res.insert(q.que[q.R]);
		return res;
	}
	public boolean equals(CQueue q)
	{
		if(this.que.length != q.que.length || this.F != q.F || this.R != q.R)
		{
			return false;
		}
		else
		{
			for (int i = q.F; i != q.R;) 
			{
				if(this.que[i] != q.que[i])
					return false;
				if(i == q.que.length-1)
					i=0;
				else 
					i++;
			}
			if(this.que[R] != q.que[R])
				return false;

		}
		return true;
	}
}








