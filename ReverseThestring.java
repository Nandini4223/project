/*Reverse the String
 satya->aytas
 soos->soos*/
 
package test1;


public class ReverseThestring {
	public static void main(String[] args) {
		String s1="satya";
		String s2="soos";
		
		for(int i=s1.length();i>0;i--)
		{
			System.out.print(s1.charAt(i-1));
		}
		System.out.println();
		for(int j=s2.length();j>0;j--)
		{
			System.out.print(s2.charAt(j-1));
		}
	}

}
