/*SUM OF TWO NUMBERS (TAKE TWO NUMBERS AS INPUT)*/
package test1;
import java.util.Scanner;
public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("sum of these numbers :"+sum);
	}

}
