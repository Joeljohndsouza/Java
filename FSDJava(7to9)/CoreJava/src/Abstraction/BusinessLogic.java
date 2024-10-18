package Abstraction;

public abstract class BusinessLogic {
	abstract void coupons();
		

}

class Weekdays extends BusinessLogic
{
	void coupons()
	
	{System.out.println("WED20");
	}
}

class Weekend extends BusinessLogic
{   
	void coupons()
	{ System.out.println("WEEKENDFUN");
}
	}