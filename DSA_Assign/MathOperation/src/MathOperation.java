
public class MathOperation {

	public static Number addition(Number n1, Number n2) {
		//Number ans =new Number();
		//ans.setNumber(n1.getNumber()+ n2.getNumber());
	 int ans = n1.getNumber() + n2.getNumber();
	 Number a =new Number(ans);
		return a;
		
	}
	
	public static Number multiply(Number n1, Number n2) {
		Number ans =new Number();
		ans.setNumber(n1.getNumber() * n2.getNumber());
		return ans;
}
		
	}	