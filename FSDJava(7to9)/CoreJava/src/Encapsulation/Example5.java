package Encapsulation;

public class Example5 {
	
	public static void main (String[] args) {
		
		try
		{
			System.out.println(5/0);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			
	System.out.println("Exception Handled");
		}
		
	
	finally {
		System.out.println("Finally Block");
	}
	
	System.out.println("code after exception");
		

		}

}
