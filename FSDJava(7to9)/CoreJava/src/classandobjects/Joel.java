package classandobjects;

public class Joel {
	

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setProductDetails(101,"Laptop", 50000);
		
		Product p2=new Product();
		p2.setProductDetails(102,"Mobile",35000);
		System.out.println("pay:"+p2.discount());
		
	}
}
