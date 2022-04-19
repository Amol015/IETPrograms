
public class Hashing {
	Student []strArray;

	Hashing(int size){
		strArray=new Student[size];
	}

	public int hashingFunct(Student str) {
		long qt=str.mobNo,rd,sum=0;
		
		while(qt!=0) {
			rd=(qt%100);
			qt=(qt/100);
			sum=sum+rd;
		}

		int key=(int)sum%strArray.length;
		return key;
	}

	public void insertL(Student str) {
		int index=hashingFunct(str);

		if(strArray[index]==null)
		{
			strArray[index]=str;
		}
		else {
			//collision
			//linear
			while(true) {
				index=(++index%strArray.length);
				if(strArray[index]==null)
				{
					strArray[index]=str;
					break;
				}
			}
		}
		System.out.println(str + " is placed at "+index);
	}
	
	public void insertQ(Student str) {
		int index=hashingFunct(str);
		System.out.print(str + " key from hashFunction = " + index);

		if(strArray[index]==null)
		{
			strArray[index]=str;
		}
		else {
			//collision
			//Quadratic
			int i=0;
			while(true) {
				index=((index+i*i)%strArray.length);
				if(index<0 || index>strArray.length) {
					i=0;
					index=0;
				}
				if(strArray[index]==null)
				{
					strArray[index]=str;
					break;
				}
				i++;
			}
		}
		System.out.println( " and is placed at "+index);
	}

	public void removeL(Student str) {
		int index=searchStrL(str);
		if(index<0) {
			System.out.println("Invalid Input");
		}
		else {
			strArray[index]=null;
			System.out.println(str + " is removed at  "+index);
		}
	}

	public int searchStrL(Student str) {
		int index=hashingFunct(str);
		//System.out.print(str + " key from hashFunction = " + index);

		if(strArray[index]!=null && strArray[index].equals(str)) {
			return index;
		}
		else {
			//collision linear
			int i=0;
			while(true) {
				index=(++index%strArray.length);
				if(strArray[index]!=null && strArray[index].equals(str)) {
					return index;
				}
				i++; 
				if(i==strArray.length) {      //only true for linear array
					return -1;
				}
			}
		}

	}

	public void removeQ(Student str) {
		int index=searchStrQ(str);
		if(index<0) {
			System.out.println("Invalid Input");
		}
		else {
			strArray[index]=null;
			System.out.println(" and is removed at  "+index);
		}
	}
	
	public int searchStrQ(Student str) {
		int index=hashingFunct(str);
		System.out.print(str + " key from hashFunction = " + index);

		if(strArray[index]!=null && strArray[index].equals(str)) {
			return index;
		}
		else {
			//collision linear
			int i=0;
			while(true) {
				index=((index+i*i)%strArray.length);
				if(index<0 || index>strArray.length) {
					i=0;
					index=0;
				}
				if(strArray[index]!=null && strArray[index].equals(str)) {
					return index;
				}
				i++; 
				if(i==strArray.length) {      //only true for linear array
					return -1;
				}
			}
		}
	}
	
	public String toString() {
		String str="";
		str=str +"{ \n";
		for(int i=0;i<strArray.length;i++) {
			str=str+strArray[i]+"\n";
		}
		str=str +"}";
		return str;
	}
}

