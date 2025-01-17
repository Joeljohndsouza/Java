package Learncollection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample5 {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> names = new LinkedList<String> ();
		
		names.add("Jason");
		names.add("Olianne");
		names.add("Moses");
		
		names.removeIf(name->name.startsWith("P"));
		System.out.println(names);
		System.out.println("---------------------------");
		
		
LinkedList<Product> product= new LinkedList<Product>();
		
		product.add(new Product (101,"Laptop",50000));
		product.add(new Product (101,"Mobile",35000));
		product.add(new Product (101,"Headphones",7000));
		
		System.out.println(product);
		
		product.removeIf(p->p.getPrice()<10000);
		System.out.println(product);
		
	}

}
