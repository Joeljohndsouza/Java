package Learncollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample7 {
	public static void main(String[] args) {
		
		List<Product> product= new LinkedList<Product>();
		
		product.add(new Product (101,"Laptop",50000));
		product.add(new Product (101,"Mobile",35000));
		product.add(new Product (101,"Headphones",7000));
		
		Comparator<Product> idComparator=(p1,p2)->p2.getId()-p1.getId();
		Comparator<Product> nameComparator=(p1,p2)->p1.getName().compareTo(p2.getName());
		Comparator<Product> priceComparator=(p1,p2)->p1.getPrice()-p2.getPrice();
        
		Collections.sort(product,idComparator);
		System.out.println(product);
		
		Collections.sort(product,nameComparator);
		System.out.println(product);
		
		Collections.sort(product,priceComparator);
		System.out.println(product);
		
	}
	

}
