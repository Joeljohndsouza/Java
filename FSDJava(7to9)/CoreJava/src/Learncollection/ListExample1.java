package Learncollection;

import java.util.ArrayList;

public class ListExample1 {
	
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		list.add(69);
		list.add("X");
		list.add(106.80);
		list.add(null);
		
		System.out.println(list);
		
		for(Object i:list)
		{
			System.out.println(i);
			
		}
		
		
		
	}

}
