package StringExamples;

public class Example3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String password="X#123";
		
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		sc.close();

		if(password.equals(pwd))
			//if(password.compareTo(pwd)==0)
				System.out.println("Login successful");
			else 
				System.out.println("Login failed");
		
		
		
		
		
		
		
	}

}
