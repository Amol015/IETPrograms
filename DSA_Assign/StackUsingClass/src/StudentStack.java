public class StudentStack 
{
	
	private String name;
	private int age;
	private char gender;
	
	StudentStack(String n, int a, char g) {
		this.name = n;
		this.age = a;
		this.gender = g;
	}

	public String toString() {

		String str = name + "," + age + "," + gender;
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}