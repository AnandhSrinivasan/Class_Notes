package constructor;

public class Para_Constructor {

		int employeeAge;
		String employeeName;
		
		public Para_Constructor(int age, String name)
		{
			employeeAge=age;
			employeeName=name;
			
			System.out.println("The employee name is "+employeeName+" and his age is "+employeeAge);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Para_Constructor obj= new Para_Constructor(23,"Arun");
			Para_Constructor obj1= new Para_Constructor(34,"Testing");
	}

}
