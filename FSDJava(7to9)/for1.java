import java.util.Scanner;
class P8
   {
public static void main (String args[])
      {
		  int primeCount=0;
		  for(int n=1; n<=100;n++)
		  {
			  
          
		  int count=0;
		  
          for (int i=1;i<=n;i++)
{
if (n%i==0)
{   
     count++;
}
}

if(count==2)
{
	System.out.println(n);
	primeCount++;
}
		  }
		  System.out.println("====================================");
		  System.out.println("primeCount :" +primeCount);
		  

   
	  }
	  }