class Student
{
	int rollNo;
	String name;
}
class Product
{
	int productId;
	String productName;
	
}


class P27
{
	

public static void main (String args[])

{
	Student s1=new Student();
	
	s1.rollNo=101;
	s1.name="Priti";
	
	System.out.println(s1.rollNo);
	System.out.println(s1.name);
	
	
	Product p1=new Product();
	
	p1.productId=90;
	p1.productName="Amul";
	
	System.out.println(p1.productId);
	System.out.println(p1.productName);
	
}
}