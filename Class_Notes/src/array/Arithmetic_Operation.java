package array;

public class Arithmetic_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class  ArithmeticOperation {
			public int add(int num1 , int num2) {
				return num1+num2;
			}
			public int sub(int num1 ,int num2) {
				return num1-num2;
			}
			public int mul(int num1 ,int num2) {
				return num1*num2;
			}
			public double div(double d ,double e) {
				if (e !=0) {
					return d/e;
				} else {
                    System.out.println("Error");
                    return Double.NaN;
				}
			}
		}	
		ArithmeticOperation calculator  = new ArithmeticOperation();
		int opadd = calculator.add(10, 5);
		int opsub = calculator.sub(10,5);
		int opmul = calculator.mul(10,5);
		double opdiv = calculator.div(10.0, 5.0);
		
		System.out.println("Add:" + opadd);
		System.out.println("Sub:" + opsub);
		System.out.println("Mul:" + opmul);
		System.out.println("Div:" + opdiv);
	}
}		
