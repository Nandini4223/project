/*SUM OF FIVE NUMBERS (TAKE FIVE NUMBERS AS INPUT)*/
package test1;
import java.util.Scanner;
public class SunOfFiveNumbers {
	public static void main(String[] args) {
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		System.out.println("enter the third number");
		int num3=sc.nextInt();

		System.out.println("enter the fourthnumber");
		int num4=sc.nextInt();
		System.out.println("enter the fifth number");
		int num5=sc.nextInt();
		sum=num1+num2+num3+num4+num5;
		System.out.println("sum of these numbers :"+sum);
		
	}
}


