/*SUM OF FIRST N NUMBERS*/
package test1;

import java.util.Scanner;

public class SumOfFirstnNumbers {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the number value");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
			sum=sum+i;
		{
	System.out.println("sum of numbers :"+sum);
}
}
}


