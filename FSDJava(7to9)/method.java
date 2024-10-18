class Calculator
{
int a;
int b;
int addition()
{
return a+b;
}
void setValues(int n1,int n2)
{a=n1;
b=n2;}

}
class P30
{
public static void main (String args[])
{
Calculator cl = new Calculator();
cl.a=12;
cl.b=10;
int sum=cl.addition();
System.out.println("Addition is " + sum);

Calculator c2= new Calculator ();
c2.setValues(120,2);
System.out.println(c2.a+""+c2.b);

Calculator c3= new Calculator ();
c2.setValues(11,5);
System.out.println(c3.a+""+c3.b);

}



}