
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;	//	to compute factorial of n
		int factorial=1;	//Init the product to 1
		
		int i=1;
		while(i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("The Factorial of "+n+" is "+ factorial);

	}

}
