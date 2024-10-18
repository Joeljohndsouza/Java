package StringExamples;

public class Example5 {
	
	public static void main(String[] args) {
		String s1="Mobile"; 
		
		for(int i=(s1.length()-1);i>=1;i--)
		{
			System.out.println(s1.charAt(i));
			
		}
		
		System.out.println("------------");
		
		for (char ch:s1.toCharArray())
		{ 
			if (ch=='0')
			count++;
		}
		
		
		System.out.println(count);
		
		
	}

}
