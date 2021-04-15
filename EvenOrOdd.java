/*Check Whether a given number even or odd*/
package test1;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		if(num%2==0)
		{
			System.out.println("the given number is even"+num);
		}
		
		else
		{
			System.out.println("the given number is odd"+num);
		}
		
	}
	

}
