// Program to take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class GreatestThree
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Three numbers ------");
		System.out.println("1st Number =  ");
		int n1 = reader.nextInt();
		System.out.println("2nd Number =  ");
		int n2 = reader.nextInt();
		System.out.println("3rd Number =  ");
		int n3 = reader.nextInt();
		reader.close();
		if (n1 > n2)
		{
			if (n1 > n3)
				{
					System.out.println("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n1);
				}
			else
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3  + " is " + n3);
				}
		}
		else
		{
			if (n2 > n3)
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3 + " is " + n2);
				}
			else
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3 + " is " + n3);
				}
		}
	}
}