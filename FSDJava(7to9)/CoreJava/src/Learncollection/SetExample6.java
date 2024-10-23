package Learncollection;

import java.util.TreeSet;

public class SetExample6 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Product> product= new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
		product.add(new Product (101,"Laptop",50000));
		product.add(new Product(102,"Mobile",35000));
		product.add(new Product(103,"Headphones",7000));
		
		System.out.println(product);
		
		
	}

}
