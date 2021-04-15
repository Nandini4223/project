/*recursion:a power b*/
package test1;

public class RecursionApowerB {
	public static void main(String[] args) {
     int a=2,b=3;
     int result=power(a,b);
     System.out.println(a+"^"+b+"="+result);
	}
	public static int power(int a,int b)
	{
		if(b!=0)
		{
			return(a*power(a,b-1));
		}
		else
		{
			return 1;
		}
	}

}
