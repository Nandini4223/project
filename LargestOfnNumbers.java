/*largest among n numbers(take n values as input)*/
package test1;
import java.util.Scanner;
public class LargestOfnNumbers {
	public static void main(String[] args) {
	int large=0;
	
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	
		if(n>large)
		{
			large=n;
		}
		System.out.println("the largest is:"+large);
	}
	
		
	}

}
