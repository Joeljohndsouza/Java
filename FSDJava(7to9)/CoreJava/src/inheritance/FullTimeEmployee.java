package inheritance;

public class FullTimeEmployee extends Employee{

	int noofleaves;
	int insuranceNo;
	
	
	FullTimeEmployee(int id, String name,int noofleavees,int insuranceNo,int monthlySalary )
	{ 
		super(id,name,monthlySalary);
		this.noofleaves= noofleavees;
	   this.insuranceNo=insuranceNo;
	}

}
