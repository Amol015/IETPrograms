
public class DQueue {

	private int [] arr;
	private int F;
	private int R;

	public DQueue() {
		this.arr = new int[5];
		this.F=-1;
		this.R=-1;
	}

	public DQueue(int size) {
		this.arr = new int[size];
		this.F=-1;
		this.R=-1;
	}

	public void insertF(int value)
	{
		//Full condition
		if(F==0  &&  R==arr.length-1)
		{
			System.out.println("DQueue is full");
		}
		else
		{
			//Check if this is the first value
			if(F == -1)
			{
				F=R=0;
			}
			//Check if we have space before F
			else if(F != 0)
			{
				F--;
			}
			//We have space after R
			else
			{
				R++;
				//Shift all values by 1 place
				for(int x=R; x>F ;x--)
				{
					arr[x] = arr[x-1];
				}
			}
			arr[F] = value;
		}
	}

	public void insertR(int value)
	{
		//Full condition
		if(F==0  &&  R==arr.length-1)
		{
			System.out.println("DQueue is full");
		}
		else
		{
			//Check if this is the first value
			if(F == -1)
			{
				F=R=0;
			}
			//check if we have space after R
			else if(R != arr.length-1)
			{
				R++;
			}
			//We have some space before F
			else
			{
				F--;
				//Shift all values by 1 place
				for(int x=F; x<R; x++)
				{
					arr[x] = arr[x+1];
				}
			}
			arr[R] = value;
		}
	}
	
	public int removeF()
	{
		int value=0;
		
		//Check for empty condition
		if(F != -1)
		{
			value = arr[F];
		
			//Check if this is the last value, if yes make F, R to -1. Else F++.
			if(F != R)
				F++;
			else
				F=R=-1;
		}
		else
			System.out.println("Queue is empty");
		
		return value;
	}
	
	public int removeR()
	{
		int value=0;
		
		//Check for empty condition
		if(R != -1)
		{
			value = arr[R];
		
			//Check if this is the last value, if yes make F, R to -1. Else R--.
			if(F != R)
				R--;
			else
				F=R=-1;
		}
		else
			System.out.println("Queue is empty");
		
		return value;
	}
	
	public void insertNewR(int value)
	{
		
		//Check if this is the first value
		if(F == -1)
		{
			F=R=0;
			arr[R] = value;
		}
		else
		{
			//check if we have space after R
			if(R != arr.length-1)
			{
				R++;
				arr[R] = value;
			}
			else if(F != 0)
			{
				F--;
				//Shift all values by 1 place
				for(int x=F; x<R; x++)
				{
					arr[x] = arr[x+1];
				}
				arr[R] = value;
			}
			else
				System.out.println("DQueue is full");
			
		}
	}

	public String toString() {
		String str = "";
		if(F == -1)
			str = "Queue is Empty!";
		else
		{
			for(int i=F; i<=R; i++)
			{
				str += arr[i] + ", ";
			}
		}
		return str;
	}
}

