package Learncollection;

import java.util.Scanner;
import java.util.Stack;

public class ListExample10 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Stack<Product> product= new Stack<Product>();
		product.push(new Product (101,"Laptop",50000));
		product.push(new Product(102,"Mobile",35000));
		product.push(new Product(103,"Headphones",7000));
		
		System.out.println("Do you want to delete last added item?(y/N)");
		System.out.println(product.peek());
		
		char decision=sc.next().charAt(0);
		if(decision=='Y'|| decision=='y') 
{
	System.out.println(product.peek().getName()+"deleted");
	}
	}
}
		
		


