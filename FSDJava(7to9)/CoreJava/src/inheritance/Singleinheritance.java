package inheritance;

class A 
{
	int add(int a ,int b)
	{
		return a+b;
	}
	
	A()
	{
		System.out.println("A constructor");
	}
	A(String value)
	
	{
		System.out.println("Parametrised Constructor(A):"+value);
	
	}
}
class B extends A
{
	int sub(int a,int b)
	{ 
		return a-b;
	}

	B()
	{
		System.out.println("B constructor");
	}
	B("String")
	{
		super(value);
		System.out.println("Parametrised Constructor(B):"+value);
	}
}



public class Singleinheritance {
	
	
	
	public static void main(String[] args) {
		B obj = new B();
		int sum=obj.add(12,2);
		System.out.println(sum);
		System.out.println(obj.sub(10,0));
	}

}
