
public class Student {
	String name;
	int age;
	long mobNo;
	String emailId;
	
	Student(){
		this.name=null;
		this.age=0;
		this.mobNo=0;
		this.emailId=null;
	}
	
	Student(String name,int age,long mobNo,String emailId){
		this.name=name;
		this.age=age;
		this.mobNo=mobNo;
		this.emailId=emailId;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public long getMobNo() {
		return this.mobNo;
	}
		
	public void setMobNo(long mobNo) {
		this.mobNo=mobNo;
	}
	
	public String getEmailId() {
		return this.emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId=emailId;
	}
	
	public String toString() {
		String str= "Name:	" +this.name + "	Age:	" + this.age 
				+ "	 Mob:	"+ this.mobNo + "	Email ID:	"+this.emailId ;
		
		return str;
	}
}
