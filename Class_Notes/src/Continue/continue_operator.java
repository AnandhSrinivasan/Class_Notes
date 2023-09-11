package Continue;

public class continue_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue statement will skip the current iteration and proceed to the next iteration based on the condition 	
		for (int i=1; i<=10;i++)
		{		
			if (i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
