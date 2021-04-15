/*SWAPPING VALUE OF TWO VARIABLES WITHOUT USING THIRD VARIABLE*/
package test1;
import java.util.Scanner;
public class SwapWithOutThird {
	public static void main(String[] args) {
		System.out.println("enter the value of N and R");
		Scanner sc=new Scanner(System.in);
		/*Define variables*/
		int N=sc.nextInt();
		int R=sc.nextInt();
		System.out.println("before swapping numbers"+N+" "+R);
		/*swapping*/
		N=N+R;
		R=N-R;
		N=N-R;
		System.out.println("after swapping"+N+" "+R);
		
	}

}
