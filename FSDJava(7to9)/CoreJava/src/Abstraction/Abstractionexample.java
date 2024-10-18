package Abstraction;

abstract class Electronics
{
	abstract void start();
	}

class TV extends Electronics
{
	void start()
	{  System.out.println("TV started");
		}
	void stop()
	{System.out.println("TV turned OFF");
	
}

class AC extends Electronics
{
	void start()
	{  System.out.println("AC started");
		}
	void stop()
	{
			System.out.println("AC turned OFF");
	}	


public class Abstractionexample {
	
	public static void main(String[] args) {
		
		new TV().start();
		new AC().start();
	}
}


