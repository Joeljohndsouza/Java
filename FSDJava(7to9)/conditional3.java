import java.util.Scanner;
class Conditionst1
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		boolean subscribed=false;
		System.out.println("Do you want to subscribe?? (y/N)");
		
	    char decision=sc.next().charAt(0);
		if (decision=='y' || decision=='Y')
			
		{
			subscribed=true;
		}
		System.out.println("subscribed:"+subscribed);
	}
}