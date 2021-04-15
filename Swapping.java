/*SWAPPING VALUES OF TWO VARIABLES*/
package test1;

public class Swapping {
	public static void main(String[] args)
	{
		int temp;
		int x=23;
		int y=42;
		
		
		// swapping in steps
		temp =x;
		x=y;
		y= temp;
		//verify swapped values
		System.out.println("x= "+x+"and y="+y);
	}
		}
