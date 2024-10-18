import java.util.Scanner;
class P20
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		char decision;
		do
		{
			System.out.println("Enter two numbers");
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			System.out.println("Addition is "+(n+m));
			System.out.println("Do you want to continue? Yes/No");
			decision=sc.next().charAt(0);
			
		}
		while(decision=='Y')
	}
}