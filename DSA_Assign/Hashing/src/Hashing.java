
public class Hashing {

	String [] strArray ;


	public Hashing(int size) {

		strArray = new String [size];
	}

	public int hashFunction(String inputStr)
	{
		int sum = 0;
		for(int i =0 ; i <inputStr.length(); i++)
		{
			sum+= inputStr.charAt(i);
		}
		int index = sum % strArray.length;
		return index;
	}

	public void insert (String inputStr)
	{
		int index = hashFunction(inputStr);

		System.out.println(inputStr + "key from hash function: "+index);



		if (strArray[index]== null)
		{
			strArray[index]= inputStr;
		}
		else {

			while(true)   // collision
			{
				/*if(index < strArray.length-1)
					index++;
				else 
					index = 0;*/

				index = (++index % strArray.length); // circular index teqhnique..

				if (strArray[index] == null)
				{
					strArray[index] = inputStr;
					break;
				}

			}
		}
		System.out.println(inputStr + " and it is placed at : "+index);
	}

	public void remove (String inputstr)
	{
		int i = search(inputstr);
	}

	private int search (String inputstr)
	{
		int index = hashFunction(inputstr);
		System.out.println(inputstr + " Key From Hashfunction =" +index);

		if (strArray[index] != null && strArray[index].equals(inputstr))
		{
			return index;
		}
		else index =0;
		{while(true)
		{
			/*if(index < strArray.length-1)
				index++;
			else 
				index = 0;*/

			index = (++index % strArray.length); // circular index teqhnique..

			if (strArray[index] != null && strArray[index].equals(inputstr))
			{
				return index;
			}
			index++;
			if (index == strArray.length) {
				return -1989898;
			}
		}
		}
	}
}





















