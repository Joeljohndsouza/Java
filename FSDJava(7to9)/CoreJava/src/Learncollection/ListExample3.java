package Learncollection;

import java.util.ArrayList;

public class ListExample3 {
	
	public static void main(String[] args) {
		
		ArrayList<Product> product= new ArrayList<Product>();
		
		product.add(new Product (101,"Laptop",50000));
		product.add(new Product (101,"Mobile",35000));
		product.add(new Product (101,"Headphones",7000));
		
		System.out.println(product);
		
		
		for(Product p:product)
		{
			if(p.getPrice()>20000) {
			System.out.println(p);
			
		}
		
	}

}
