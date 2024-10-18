package StringExamples;

public class Example4 {
	
	public static void main(String[] args) {
		
		String s1="Hello";
		s1=s1.concat("World");
		
		System.out.println(s1);
		
		System.out.println("----------------------------");
		System.out.println("He  ll  o".trim()+"World");
		System.out.println("Janki".charAt(0));
		System.out.println("-----------------------");
		System.out.println("Laptop".indexOf('p',3));
		
		System.out.println("Laptop".startsWith("La"));
		
		String s2="Bottle";
		char arr[]=s2.toCharArray();
		
		for(char ch:arr)
		{System.out.println("ch");}
		
		System.out.println("----------------------");
		
		
	}

		
		
	}

