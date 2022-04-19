
public class Employee {
	
	private int empId;
    private String empName;
    private float basicSalary;
   
    
   public Employee(int id,String name,float salary)
    {
    	empId = id;
    	empName = name;
    	basicSalary = salary;
    }

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
    public float calculate_Salary(float basicSalary)
    {
    	float final_Salary;
    	return final_Salary = basicSalary + 1000;
    }

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + "]";
	}
    
}
