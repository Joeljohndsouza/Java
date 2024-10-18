package Abstraction;
@FunctionalInterface


public interface I6 
{ 
	void printName(String name);
	

}


@FunctionalInterface
interface I8
{int sqr(int a,int b);}



public class ExampleInterface5 {
	public static void main (String[] args) {
		I6 obj=(name)->System.out.println("My name is "+name);
		obj.printName("Joel");
		
		I6 obj1=(name)-->{
			for(int i=1;i<=100;i++)
			{
				System.out.println(name);
			}
		};
		
		obj1.printname("Joel");
		
	}
}
