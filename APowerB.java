/*Iteration:
 a power b
 */
package test1;
import java.util.Scanner;
public class APowerB {
	public static void main(String[] args) {
		int power=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			power=power*a;
		}
System.out.println("\n the final result of"+a+"power"+b+"="+power);
			}
}
