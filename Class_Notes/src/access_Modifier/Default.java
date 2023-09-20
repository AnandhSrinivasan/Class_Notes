package access_Modifier;
public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class A1 {
			
			void msg()
			{
				System.out.println("Default method");
			}

		}

		class access_Modifier
		{
			public static void main(String args[])
			{
				Public obj= new Public();
				obj.getClass();
			}
			
		}
	}
}
//		==========================================================================          =======================


		/*//To import classes from another package, we need to use import statement
		public class DefaultAccessModifier {
			
			public static void main(String args[])
			{
				//It throws a compile time error because A1 class scope is limited only to the same class and same package. Here we are trying to access from a different package
				A1 obj = new A1();
			}

		}
	}

}*/
