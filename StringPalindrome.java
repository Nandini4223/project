/*CHECK WHETHER A GIVEN STRING IS PALINDROME OR NOT*/
package test1;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		str=sc.next();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str.charAt(i);
		
		if(str.equals(rev))
		{
			System.out.println(str+"is a palindrome");
		}
		else
		{
			System.out.println(str+"is not a palindrome");
		
		
	}
	}

}
