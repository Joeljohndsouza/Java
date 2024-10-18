package Abstraction;

public class ExampleInterface2 {
	public static void main (String[] args) {
		
		Bank sb=new ICICI();
		sb.details();
		sb.address();
		sb.methodBank();
		Bank.staticmethod();
		
		Bank axis= new Bank() {
			public void details () {
				System.out.println("Details of Axis bank");
			}
			
			
			public void address () {
				System.out.println("Address of Axis bank");
				
			}
		};
		
		axis.details();
		axis.address();
		

}
}
