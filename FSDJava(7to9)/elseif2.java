import java.util.Scanner;
class P15
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
	
		System.out.println("1:Add 2:sub 3:mul 4:div");
		int p=sc.nextInt();
		
		
		if(p==1)
		{
			System.out.println("Addition is"+(n+m));
		}
		else if (p==2)
			{
			System.out.println("Subtraction is"+(n-m));
		}
		else if (p==4)
			{
			System.out.println("Division is"+(n/m));
		}
		else if (p==3)
			{
			System.out.println("Multiplication is"+(n*m));
		}
		else
			{
			System.out.println("Invalid");
		}
		
	}
}
		
	