import java.util.Scanner;
class P8
   {
public static void main (String args[])
      {
		  Scanner sc=new Scanner (System.in);
          int n=100;
		  int count=0;
          for (int i=1;i<=n;i++)
{
if (n%i==0)
{    System.out.print(i+"");
     count++;
}
}
System.out.println("Count"+count);
if(count==2)
{
	System.out.println(n+" is Prime");
}
else
{
	System.out.println(n+" is not Prime");
	
   }
   }
   }