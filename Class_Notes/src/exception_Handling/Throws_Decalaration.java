package exception_Handling;

//throw is used to create our own exceptions
public class Throws_Decalaration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.throwArithmeticException(17);
	}
}
class ThrowException
{
	static void throwArithmeticException(int age)
	{
		if(age<=18)
		{
			throw new ArithmeticException("age must be greater than 18");
			//throw new NullPointerException("age is grater than 18");
		}
		else
		{
			System.out.println("age is greater than 18");
		}
	}
}
