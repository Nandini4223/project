/*Find a given number existing or not in the array*/
package test1;

public class ExistingNumber {
	public static void main(String[] args) {
		int[] num= {23,42,55,40};
		int toFind=42;
		boolean found=false;
		for(int n: num)
		{
			if(n== toFind)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println(toFind+"is Find :");
		}
		else
		{
			System.out.println(toFind+"is not Find");
		}
		
	}

}
