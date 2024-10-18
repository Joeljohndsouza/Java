package Encapsulation;

public class Example4 {
	
	public static void main (String[] args) {
		
		String s="Laptop";
		try 
		{
			s.charAt(2);
		}
		
		catch (StringIndexOutOfBoundsException e)
		{
	
			s.charAt(80);
		
		}

}
