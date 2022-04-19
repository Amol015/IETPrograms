
public class Main
{
    public static void main(String [] str)
    {
        Number n1 = new Number(10);
        Number n2 = new Number(20);
    

        Number n3 = MathOperation.addition(n1, n2);
        System.out.println("Addition of " + n1 + " and " + n2 + " is : " + n3);

        Number n4 = MathOperation.multiply(n3, n2);
        System.out.println("Multiplication of " + n3 + " and " + n2 + " is : " + n4);

        if(n4.greaterNum(n1))
        {
             n1.setNumber(n4.getNumber());
        }

        System.out.println("Finally n1=" + n1);
    }
}