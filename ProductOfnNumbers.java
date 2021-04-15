/*PRODUCT OF N NUMBERS(TAKE N VALUE AS INPUT)*/
package test1;

import java.util.Scanner;

public class ProductOfnNumbers {
	public static void main(String[] args) {
		int product=1;
		System.out.println("Enter the number value");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
			product *=i;
		{
	System.out.println("product  of numbers :"+product);
}
}
}


