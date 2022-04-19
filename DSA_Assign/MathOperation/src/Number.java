
public class Number {
	
	private int num;

	public Number() {
		
	}

	public Number(int num) 
	{
		this.num = num;
	}
	
	public int getNumber() {
		
		return num;
	}

	public void setNumber(int number) {
		this.num=number;
		
	}

	public String toString() {
		return "Number num=" + num ;
	}
	
	public boolean greaterNum(Number n1) {
		if(this.num>n1.num)
			return true;
		else
		return false;
	}

	
}
