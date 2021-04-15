/*Largest among 2 numbers (take 2 values as input)*/
package test1;
import java.util.Scanner;
public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("the largest number:"+num1);
		}
		else if(num2>num1)
		{
			System.out.println("the largest number:"+num2);
		}
		else
		{
			System.out.println("the given to numbers are equal");
		}
	}

}
