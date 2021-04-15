/*Reverse digits of a given number 456 then 654*/
package test1;

import java.util.concurrent.SynchronousQueue;
public class ReverseNumber {
	public static void main(String[] args) {
		int b, m=0,sum=0;
		
		int n=456;
		do
		{
		 b=n%10;
		 m=m*10+b;
		 sum=sum+b;
		 n=n/10;
		}
		while(n>0);
			 System.out.println("Reverse:"+m);
		 }
		 
		
}



