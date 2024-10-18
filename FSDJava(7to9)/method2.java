class Employee
{ int empId;
 String empName;
int salary;

void setEmpDetails(int empId,String empName,int salary)
{
	this.empId=empId;
	this.empName=empName;
	this.salary=salary;
	System.out.println(this.empId+""+this.empName+""+this.salary);
}
	
}

class P30
{
public static void main (String args[])
{
	Employee el=new Employee();
	el.setEmpDetails(101,"Riya",20000);
 
}
}