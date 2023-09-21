package final_Java;

/*
 * Java Final keyword is used to restrict the user and it can be used along with variables, methods and classes
 * 1. Whenever we declare a variable as final, then that value of the varaible cant be changed
 * 2. Whenever we declare a method as final, that method cant be overridden in the child class
 * 3. Whenever we declare a class as final, that class cannot be extended
 */
public class Final_Variable {
	
	final int rollNo=10;
	
	void displayDetails()
	{
		//rollNo=20; //compile time error
		System.out.println("The rolle no is "+rollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Overriding is not possible here because the method is declared as final
		Final_Variable obj= new Final_Variable();
		obj.displayDetails();
	}

}
