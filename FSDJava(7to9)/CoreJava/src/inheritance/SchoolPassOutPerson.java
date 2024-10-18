package inheritance;

public class SchoolPassOutPerson extends Person{
	String schoolCertificateNo;
	
	SchoolPassOutPerson(int id,String name,String schoolCertificationNo)
	{
		super(id,name);
		this.schoolCertificateNo=schoolCertificateNo;}

}
