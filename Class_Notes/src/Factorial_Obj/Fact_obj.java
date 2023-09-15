package Factorial_Obj;

public class Fact_obj {
		// TODO Auto-generated method stub
		//Inside class, we will have 2 things one is method and variable
		
		//method is created for storing the logic of the program
		int employeeAge=100;		
		public void factorialCalculation()
		{
			int number = 5;
			int factorial = 1;
			for (int i=1; i<=number; i++) {
				factorial = factorial * i;
				
			}
			System.out.println("Factorial is: "+factorial);
		}
		public void factorialCalculationWithNos(int num)
		{
			int factorial = 1;
			for (int i=1; i<=num; i++) {
				factorial = factorial * i;		
			}
			System.out.println("Factorial is: "+factorial);
		}
			public static void main(String[] args) {
			// TODO Auto-generated method stub
				//classname obj = new classname
				Fact_obj fact= new Fact_obj();
				fact.factorialCalculation();
				fact.factorialCalculationWithNos(6);
				System.out.println("The value of employee age is "+fact.employeeAge);
				
				// we can create n no of objects to a class
				Fact_obj fact1= new Fact_obj();
				fact1.factorialCalculation();
				fact1.factorialCalculationWithNos(10);
				
				Fact_obj fact2= new Fact_obj();
				fact2.factorialCalculation();
	}
}
