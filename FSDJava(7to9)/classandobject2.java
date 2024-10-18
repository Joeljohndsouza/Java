class Calculator
{
int a;
int b;
int addition()
{
return a+b;
}

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
}
}