package Abstraction;

public interface Bank {
	void details();
	void address();
	
	default void methodBank()
	{
		System.out.println("Default method");
	}
	
	static void staticmethod()
	{
		System.out.println("Static method From B");
		}
	
	

}
