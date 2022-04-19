
public class Employee {
	
	private String name;
	private int age;
	private float salary;
	
	public Employee() {
		this.name = null;
		this.age = 0;
		this.salary = 0.0f;
	}

	public Employee(String empName, int age, float salary) {
		this.name = empName;
		this.age = age;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	public String toString() {
		return "	Name : " +name+ "	Age : " +age+ "	 Salary : " +salary+ "\n";
	}
}
