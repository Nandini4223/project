/*Check whether a given number is perfect or not*/
package test1;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
	int sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any integer");
	 int n=sc.nextInt();
	 for(int i=1;i<n;i++)
	 {
		 if(n %i==0)
		 {
			 sum=sum+i;
		 }
	 }
	if(sum==n)
	{
		System.out.println("Given number is perfect");
	}
	else
	{
		System.out.println("Given number is not perfect");
	}

}
}
