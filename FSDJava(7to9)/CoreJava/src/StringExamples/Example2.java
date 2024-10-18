package StringExamples;

public class Example2 {

	public static void main(String[] args) {
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		
		System.out.println("==========================");
		System.out.println("==========================");
		
		System.out.println(a.equalsIgnoreCase(b));
		
		String c="A";
		String d="h";
		System.out.println(c.compareTo(d));
		
		String s="INDIA";
		System.out.println(s.toLowerCase());
		//s=s.toLowerCase();
		System.out.println(s);
		
		
		
		
		
		
		
		
		
	}
}
