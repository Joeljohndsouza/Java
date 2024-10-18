import java.util.Scanner;
class Conditionst1
{
	public static void main (String args[])
	{
		Scanner joel = new Scanner(System.in); // System.in = because we write it in command promt 
		int n=joel.nextInt();
		if (n>0)
		{
			System.out.println("You have entered a positive value");
		}
	}
}