/*SUM OF THREE NUMBERS (TAKE THREE NUMBERS AS INPUT)*/
package test1;
import java.util.Scanner;
public class SumOfThreeNumbers {
	public static void main(String[] args) {
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		System.out.println("enter the third number");
		int num3=sc.nextInt();
		sum=num1+num2+num3;
		System.out.println("sum of these numbers :"+sum);
	}

}