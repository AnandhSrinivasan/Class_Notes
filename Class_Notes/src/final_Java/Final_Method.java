package final_Java;
/*
 *When we declare final in method, We can't over-ride the method in the child class
 */
class Bike1
{
	final void run()
	{
		System.out.println("Bike is starting");
	}
}

public class Final_Method extends Bike1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Overriding is not possible here because the method is declared as final
		Final_Method obj= new Final_Method();
		obj.run();
	}

}
