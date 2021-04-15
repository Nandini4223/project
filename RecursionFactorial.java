/*recursion: Factorial of a given number*/
package test1;

public class RecursionFactorial {
public 	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	public static void main(String[] args) {
		int i,fact=1;
		int n=4;
		fact=factorial(n);
		
		{
			System.out.println("factorial of"+n+"is"+fact);
			
		}
		
	}

}
