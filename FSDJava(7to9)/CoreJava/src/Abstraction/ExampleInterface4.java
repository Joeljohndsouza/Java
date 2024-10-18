 package Abstraction;
 
 @FunctionalInterface
 interface Test
 
 {
	 boolean isEven(int n);
	 }
 

public class ExampleInterface4 {
	public static void main (String[] args) {
		
		new Test () {
			
					public boolean isEven (int n)
					{return n%2==0;
					}
				};
				Test t1=(n)->n%2==0;
				boolean ans = t1.isEven(50);
				System.out.println(ans);
			}
		}
	


