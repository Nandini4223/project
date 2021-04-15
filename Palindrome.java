/*CHECK WHETHER THE GIVEN NUMBER IS PALINDROME OR NOT*/
package test1;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	System.out.println("Enter any value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r,sum=0,temp;
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("the given number is palindrome");
		
	}
	else
	{
		System.out.println("the given number not a palindrome");
	}
	
}
}
