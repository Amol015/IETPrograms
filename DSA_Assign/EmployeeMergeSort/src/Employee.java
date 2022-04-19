
public class Employee {
	
	private String name;
	private int age;
	private int Empid;
	private float salary;
	
	public Employee() {
		this.name = null;
		this.age = 0;
		this.salary = 0.0f;
		this.Empid=0;
	}

	public Employee(String empName, int age, float salary,int empid) {
		this.name = empName;
		this.age = age;
		this.salary = salary;
		this.Empid=empid;
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
	

	
	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String toString() {
		return "Name : " +name+ "	EmpId : "+Empid+	"	Age : " +age+ "	 Salary : " +salary+ "\n";
	}
}
